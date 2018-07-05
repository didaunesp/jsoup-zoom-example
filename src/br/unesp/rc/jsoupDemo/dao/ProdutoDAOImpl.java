/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.rc.jsoupDemo.dao;

import br.unesp.rc.jsoupDemo.model.Produto;
import br.unesp.rc.jsoupDemo.utils.FabricaConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author raduke
 */
public class ProdutoDAOImpl implements ProdutoDAO{
    public boolean salvar(Produto produto){
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;
        boolean b = false;
        long idProduto = -1;
        
        con = FabricaConexao.getConexao();
        if (con != null) {
            try {
                con.setAutoCommit(false);
                
                //executa inserção do produto
                pstm = con.prepareStatement(INSERT_PRODUTO,
                        PreparedStatement.RETURN_GENERATED_KEYS);
                pstm.setString(1, produto.getNome());
                pstm.executeUpdate();
                
                res = pstm.getGeneratedKeys();
                while (res.next()) {
                    idProduto = res.getLong(1);
                }
                
                pstm = con.prepareStatement(INSERT_PRECO);
                pstm.setLong(1, idProduto);
                pstm.setString(2, produto.getPreco());
                
                //OBTEM DATA ATUAL TODO: ENCAPSULAR EM UM HELPER
                //DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date date = new Date();
                //String hoje = dateFormat.format(date);
                
                pstm.setDate(3, (java.sql.Date) date);
                
                con.commit();
                b = true;
            } catch (SQLException ex) {
                System.out.println("Message: " + ex.getMessage());
            }
        }
        return b;
    }
}
