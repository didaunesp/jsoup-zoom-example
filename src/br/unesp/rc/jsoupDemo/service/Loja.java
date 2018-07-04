/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.rc.jsoupDemo.service;

import java.io.IOException;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.*;
/**
 *
 * @author raduke
 */
abstract class Loja {
    
    protected String classeProduto;
    protected String url;
    public ArrayList<Produto> produtos = new ArrayList();
    
    public void pesquisar(){
        try
        {
            Document doc = Jsoup.connect(this.url).get();
            Elements produtos = doc.getElementsByClass(this.classeProduto);
            for(Element item : produtos)
            {
                Produto produto = new Produto(this.getNomeProduto(item), this.getPrecoProduto(item));
                this.produtos.add(produto);
            }
        }
        catch(IOException err)
        {
            System.out.print(err.getMessage());
        }
    }
    public abstract String getPrecoProduto(Element item);
    public abstract String getNomeProduto(Element item);
}
