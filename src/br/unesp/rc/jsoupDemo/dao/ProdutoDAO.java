/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.rc.jsoupDemo.dao;

import br.unesp.rc.jsoupDemo.model.Produto;

/**
 *
 * @author raduke
 */
public interface ProdutoDAO {
    final String INSERT_PRODUTO
            = "INSERT INTO produtos(nome) "
            + "VALUES(?)";
    
    final String INSERT_PRECO
            = "INSERT INTO preco(idProduto, preco, data) "
            + "VALUES(?, ?, ?)";
    
    public boolean salvar(Produto produto);
}
