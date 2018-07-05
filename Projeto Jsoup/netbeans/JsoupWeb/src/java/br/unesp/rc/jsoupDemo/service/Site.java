package br.unesp.rc.jsoupDemo.service;

public interface Site {

    /**
     * Propriedade para armezenar nome do produto
     */
    //String nome;

    /**
     *  Propriedade para armazenar preco do produto
     */
    // String preco;
    
    void pesquisar();
    String buscaPreco();
    String buscaNome();
    String buscaPrecoNome();
}
