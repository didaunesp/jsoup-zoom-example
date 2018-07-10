package br.unesp.rc.jsoupDemo.dao;

import br.unesp.rc.jsoupDemo.model.Loja;
import br.unesp.rc.jsoupDemo.model.Preco;
import br.unesp.rc.jsoupDemo.model.Produto;
import br.unesp.rc.jsoupDemo.utils.FabricaConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProdutoDAOImpl implements ProdutoDAO{
    
    private PreparedStatement pstm;
    
    public ProdutoDAOImpl(){
        this.pstm = null;
    }
    
    /**
     *
     * @param produto
     * @return
     * @throws SQLException
     */
    @Override
    public boolean salvar(Produto produto) throws SQLException{
        Connection con = null;
        boolean b = false;
        int idProduto = -1;
        
        con = FabricaConexao.getConexao();
        if (con != null) {
            con.setAutoCommit(false);
                
            //executa inserção do produto
            idProduto = this.getOrNew(con, produto);
                
            PrecoDAOImpl preDao = new PrecoDAOImpl();
            preDao.checkAndSave(con, produto.getPreco(), idProduto);
            con.commit();
            b = true;
        }
        return b;
    }
    
    private int getOrNew(Connection con, Produto produto) throws SQLException{
        ResultSet res = null;
        int idProduto = -1;
        
        pstm = con.prepareStatement(GET_PRODUTO);
        pstm.setString(1, produto.getNome());
        res = pstm.executeQuery();
        while (res.next()) {
            idProduto = res.getInt(1);
        }
        if(idProduto != -1){
            return idProduto;
        }
        
        pstm = con.prepareStatement(INSERT_PRODUTO,
            PreparedStatement.RETURN_GENERATED_KEYS);
        pstm.setString(1, produto.getNome());
        pstm.executeUpdate();
                
        res = pstm.getGeneratedKeys();
        while (res.next()) {
            idProduto = res.getInt(1);
        }
        return idProduto;
    }
    
    @Override
    public ArrayList<Produto> lista(String nome){
        ArrayList<Produto> produtos = null;
        try {
            Connection con = null;
            
            pstm = con.prepareStatement(LISTA_PRODUTO);
                    pstm.setString(1, nome);
                    ResultSet res = pstm.executeQuery();
                    
                    while (res.next()){
                        //Loja loja = new Loja(res.getString("nomeLoja"));
                        //Preco preco = new Preco(res.getString("preco"), res.getDate("data"), loja);
                        //Produto produto = new Produto(res.getString("nomeProduto"), preco);
                        //produtos.add(produto);
                    }
        } catch (SQLException ex) {
            System.out.println("Message: " + ex.getMessage());
        }
        return produtos;
    }
}
