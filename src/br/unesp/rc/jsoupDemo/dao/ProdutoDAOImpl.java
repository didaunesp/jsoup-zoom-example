package br.unesp.rc.jsoupDemo.dao;

import br.unesp.rc.jsoupDemo.model.Produto;
import br.unesp.rc.jsoupDemo.utils.FabricaConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProdutoDAOImpl implements ProdutoDAO{
    public boolean salvar(Produto produto){
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;
        boolean b = false;
        
        con = FabricaConexao.getConexao();
        if (con != null) {
            try {
                con.setAutoCommit(false);
                
                // edao.salvar(con, e, idCliente); - considerar exemplo pra salvar preco
                
                pstm = con.prepareStatement(INSERT_PRODUTO);
                pstm.setString(1, produto.getNome());
                pstm.executeUpdate();

                con.commit();
                b = true;
            } catch (SQLException ex) {
                System.out.println("Message: " + ex.getMessage());
            }
        }
        return b;
    }
}
