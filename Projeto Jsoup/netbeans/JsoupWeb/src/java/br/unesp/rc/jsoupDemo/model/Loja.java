package br.unesp.rc.jsoupDemo.model;

public class Loja {
    protected int idLoja;
    protected String nome;
    protected String urlLoja;
        
    public Loja(String nome, String url, int idLoja){
        this.idLoja = idLoja;
        this.nome = nome;
        this.urlLoja = url;
    }
    
    public int getIdLoja(){
        return this.idLoja;
    }
    
    public String getUrlLoja() {
        return this.urlLoja;
    }

    public void setUrlLoja(String url) {
        this.urlLoja = url;
    }
    
    public void setIdLoja(int idLoja){
        this.idLoja = idLoja;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
}
