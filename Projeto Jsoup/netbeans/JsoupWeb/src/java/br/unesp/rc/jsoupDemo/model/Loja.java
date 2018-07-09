package br.unesp.rc.jsoupDemo.model;

public class Loja {
    protected String nome;
    
    public Loja(String nome){
        this.nome = nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
}
