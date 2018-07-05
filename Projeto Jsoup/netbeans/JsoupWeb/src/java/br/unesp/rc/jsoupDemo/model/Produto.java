package br.unesp.rc.jsoupDemo.model;

public class Produto {
    private String nome;
    public Preco preco;
    
    public Produto(String nome, Preco preco){
        this.setNome(nome);
        this.setPreco(preco);
    }
    
    public void setPreco(Preco preco){
        this.preco = preco;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public Preco getPreco(){
        return this.preco;
    }
    
    public String getNome(){
        return this.nome;
    }
}
