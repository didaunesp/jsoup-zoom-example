package br.unesp.rc.jsoupDemo.model;

import java.util.Date;

public class Preco {
    private String preco;
    
    private Date data;
    
    public Preco(String preco, Date data){
        this.preco = preco;
        this.data = data;
    }
    
    public void setPreco(String preco){
        this.preco = preco;
    }
    
    public void setData(Date data){
        this.data = data;
    }
    
    public String getPreco(){
        return this.preco;
    }
    
    public Date getData(){
        return this.data;
    }
    
}
