package br.unesp.rc.jsoupDemo.model;

import java.sql.Date;

public class Preco {
    private String preco;
    private Date data;
    private String linkProduto;

    public String getLinkProduto() {
        return linkProduto;
    }

    public void setLinkProduto(String linkProduto) {
        this.linkProduto = linkProduto;
    }
    public Loja loja;
    
    public Preco(String preco, Date data, Loja loja, String link){
        this.preco = preco;
        this.data = data;
        this.linkProduto = link;
        this.loja = loja;
    }
    
    public void setLoja(Loja loja){
        this.loja = loja;
    }
    
    public void setPreco(String preco){
        this.preco = preco;
    }
    
    public void setData(Date data){
        this.data = data;
    }
    
    public Loja getLoja(){
        return this.loja;
    }
    
    public String getPreco(){
        return this.preco;
    }
    
    public Date getData(){
        return this.data;
    }
    
}
