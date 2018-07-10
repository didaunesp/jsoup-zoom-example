package br.unesp.rc.jsoupDemo.dao;

import br.unesp.rc.jsoupDemo.model.Produto;
import java.sql.SQLException;
import java.util.ArrayList;

public interface ProdutoDAO {
    final String INSERT_PRODUTO
            = "INSERT INTO produtos(nome, imagem) "
            + "VALUES(?, ?)";
    
    final String GET_PRODUTO
            = "SELECT Produtos.idProdutos FROM Produtos "
            + "WHERE nome = ?";
    
    final String LISTA_PRODUTO
            = "SELECT Produtos.idProdutos, Produtos.nome as nomeProduto, Produtos.imagem,"
            + " Preco.preco, Preco.data, Preco.url, Loja.nome as nomeLoja, Loja.idLoja, Loja.url as urlLoja"
            + " FROM Produtos "
            + "JOIN Preco ON Produtos.idProdutos = Preco.idProduto "
            + "JOIN Loja ON Preco.idLoja = Loja.idLoja "
            + "WHERE Produtos.nome LIKE ? "
            + "ORDER BY data desc "
            + "LIMIT 10";
    
    public boolean salvar(Produto produto) throws SQLException, ClassNotFoundException;
    public ArrayList<Produto> lista(String nome) throws SQLException, ClassNotFoundException;
}
