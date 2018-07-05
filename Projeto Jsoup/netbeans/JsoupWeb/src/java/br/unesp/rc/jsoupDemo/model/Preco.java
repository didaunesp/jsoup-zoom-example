package br.unesp.rc.jsoupDemo.model;

import java.util.Date;

public class Preco {
    private String preco;
    private Date data;
    public Loja loja;
    
    public Preco(String preco, Date data, Loja loja){
        this.preco = preco;
        this.data = data;
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
