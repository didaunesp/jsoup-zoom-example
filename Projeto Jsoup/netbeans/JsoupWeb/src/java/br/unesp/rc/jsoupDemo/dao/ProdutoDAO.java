package br.unesp.rc.jsoupDemo.dao;

import br.unesp.rc.jsoupDemo.model.Produto;
import java.sql.SQLException;
import java.util.ArrayList;

public interface ProdutoDAO {
    final String INSERT_PRODUTO
            = "INSERT INTO produtos(nome) "
            + "VALUES(?)";
    
    final String GET_PRODUTO
            = "SELECT Produtos.idProdutos FROM Produtos "
            + "WHERE nome = ?";
    
    final String LISTA_PRODUTO
            = "SELECT Produtos.idProdutos, Produtos.nome as nomeProduto, "
            + "Preco.preco, Preco.data, Loja.nome as nomeLoja"
            + " FROM Produtos "
            + "JOIN Preco ON Produtos.idProduto = Preco.idProduto "
            + "JOIN Loja ON Preco.idLoja = Loja.idLoja "
            + "WHERE Produto.nome LIKE %?% "
            + "ORDER BY preco desc";
    
    public boolean salvar(Produto produto) throws SQLException;
    public ArrayList<Produto> lista(String nome);
}
