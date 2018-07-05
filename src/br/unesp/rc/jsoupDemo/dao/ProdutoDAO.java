package br.unesp.rc.jsoupDemo.dao;

import br.unesp.rc.jsoupDemo.model.Produto;

public interface ProdutoDAO {
    final String INSERT_PRODUTO
            = "INSERT INTO produtos(nome) "
            + "VALUES(?)";
    
    public boolean salvar(Produto produto);
}
