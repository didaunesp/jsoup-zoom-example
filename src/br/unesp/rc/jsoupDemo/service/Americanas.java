package br.unesp.rc.jsoupDemo.service;

import java.io.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

public class Americanas extends Loja{
    
    public Americanas(){
        this.classeProduto = "product-grid-item";
        this.url = "https://www.americanas.com.br/busca/smartphone";
    }

    @Override
    public String getPrecoProduto(Element item) {
        return item.getElementsByClass("card-product-price").text();
    }

    @Override
    public String getNomeProduto(Element item) {
       return item.getElementsByClass("card-product-name").text();
    }
}