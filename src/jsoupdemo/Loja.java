/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsoupdemo;

/**
 *
 * @author raduke
 */
abstract class Loja {
    /**
     * Propriedade para armezenar nome do produto
     */
    String nome;

    /**
     *  Propriedade para armazenar preco do produto
     */
    String preco;
    
    public Loja(){
        this.nome = nome;
    }
    
    public abstract void pesquisar();
    public abstract String buscaPreco();
    public abstract String buscaNome();
    public abstract String buscaPrecoNome();
}
