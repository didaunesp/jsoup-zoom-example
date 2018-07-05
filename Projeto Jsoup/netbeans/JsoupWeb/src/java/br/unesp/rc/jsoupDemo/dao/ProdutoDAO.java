package br.unesp.rc.jsoupDemo.dao;

import br.unesp.rc.jsoupDemo.model.Produto;

public interface ProdutoDAO {
    final String INSERT_PRODUTO
            = "INSERT INTO produtos(nome) "
            + "VALUES(?)";
    
    final String INSERT_PRECO
            = "INSERT INTO preco(idProduto, preco, data) "
            + "VALUES(?, ?, ?)";
    
    public boolean salvar(Produto produto);
}
