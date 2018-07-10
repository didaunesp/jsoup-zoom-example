package br.unesp.rc.jsoupDemo.model;

public class Loja {
    protected String nome;
    protected String urlLoja;
        
    public Loja(String nome, String url){
        this.nome = nome;
        this.urlLoja = url;
    }
    
    public String getUrlLoja() {
        return urlLoja;
    }

    public void setUrlLoja(String url) {
        this.urlLoja = url;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
}
