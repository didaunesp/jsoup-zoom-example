/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.rc.jsoupDemo.dao;

import br.unesp.rc.jsoupDemo.model.Preco;
import java.sql.Connection;
import java.sql.SQLException;


/**
 *
 * @author raduke
 */
public interface PrecoDAO {
    final String INSERT_PRECO
        = "INSERT INTO preco(idProduto, preco, data, idLoja, url) "
        + "VALUES(?, ?, ?, ?, ?)";
    
    final String GET_PRECO
        = "SELECT Preco.* from Preco "
        + "JOIN Loja on Preco.idLoja = Loja.idLoja"
        + "WHERE idProduto = ? "
        + "AND loja.Nome = ? "
        + "AND data = ?";
        
    public void salvar(Preco preco, Connection con, int idProduto) throws SQLException;
    public void checkAndSave(Connection con, Preco preco, int idProduto) throws SQLException;
    public boolean precoExiste(Preco preco, int idProduto, Connection con);
}
