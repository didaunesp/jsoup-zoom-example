/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.rc.jsoupDemo.dao;

import br.unesp.rc.jsoupDemo.model.Preco;
import java.sql.Connection;


/**
 *
 * @author raduke
 */
public interface PrecoDAO {
    final String INSERT_PRECO
        = "INSERT INTO preco(idProduto, preco, data) "
        + "VALUES(?, ?, ?)";
    
    final String GET_PRECO
        = "SELECT Preco.* from Preco "
        + "JOIN Loja on Preco.idLoja = Loja.idLoja"
        + "WHERE idProduto = ? "
        + "AND loja.Nome = ? "
        + "AND data = ?";
        
    public void salvar(Preco preco, Connection con, int idProduto);
    public void checkAndSave(Connection con, Preco preco, int idProduto);
    public boolean precoExiste(Preco preco, int idProduto, Connection con);
}
