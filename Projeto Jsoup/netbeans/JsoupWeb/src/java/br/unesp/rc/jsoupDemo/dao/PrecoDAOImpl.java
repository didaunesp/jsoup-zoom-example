/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.rc.jsoupDemo.dao;

import static br.unesp.rc.jsoupDemo.dao.ProdutoDAO.GET_PRODUTO;
import br.unesp.rc.jsoupDemo.model.Preco;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author raduke
 */
public class PrecoDAOImpl implements PrecoDAO{

    @Override
    public void salvar(Preco preco, Connection con, int idProduto) {
        try {
            PreparedStatement pstm = null;
            pstm = con.prepareStatement(INSERT_PRECO);
            pstm.setLong(1, idProduto);
            pstm.setString(2, preco.getPreco());
            pstm.setDate(3, (java.sql.Date) preco.getData());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Message: " + ex.getMessage());
            String msg2 = ex.getMessage();
            msg2 = msg2;
        }
    }
    
    @Override
    public void checkAndSave(Connection con, Preco preco, int idProduto){
        PreparedStatement pstm = null;
        boolean existe = this.precoExiste(preco, idProduto, con);
        this.salvar(preco, con, idProduto);
    }
    
    @Override
    public boolean precoExiste(Preco preco, int idProduto, Connection con){
        try {
            ResultSet res = null;
            int idPreco = -1;
            PreparedStatement pstm = null;
            
            pstm = con.prepareStatement(GET_PRECO);
            pstm.setInt(1, idProduto);
            pstm.setString(2, preco.loja.getNome());
            pstm.setDate(3, (Date) preco.getData());
            res = pstm.executeQuery();
            while (res.next()) {
                idPreco = res.getInt(1);
            }
            if(idPreco != -1){
                return true;
            }
        } catch (SQLException ex) {
            System.out.println("Message: " + ex.getMessage());
        }
        return false;
    }
}
