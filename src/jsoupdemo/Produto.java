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
public class Produto {
    private String nome;
    private String preco;
    
    public Produto(String nome, String preco){
        this.setNome(nome);
        this.setPreco(preco);
    }
    
    public void setPreco(String preco){
        this.preco = preco;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getPreco(){
        return this.preco;
    }
    
    public String getNome(){
        return this.nome;
    }
}
