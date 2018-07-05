package br.unesp.rc.jsoupDemo.service;

import br.unesp.rc.jsoupDemo.model.Preco;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

public class MagazineLuizaService extends LojaService{

    @Override
    public Preco getPrecoProduto(Element item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNomeProduto(Element item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /*
    public MagazineLuizaService(){
        this.classeProduto = "product";
        this.url = "https://www.magazineluiza.com.br/busca/smartphone";
    }

    @Override
    public String getPrecoProduto(Element item) {
            String preco = item.getElementsByClass("price").text();
            if(preco.isEmpty()){
                return preco;
            } else {
                return "Produto indisponível";
            }
            //Elements precoOriginal = item.getElementsByClass("originalPrice");
                if (!precoOriginal.isEmpty()) {
                    String precoAtual = item.getElementsByClass("price").text();
                    System.out.println(precoOriginal.text() + " " + precoAtual);
                } else {
                    System.out.println("Produto indisponível");
                }
    }

    @Override
    public String getNomeProduto(Element item) {
        return item.getElementsByClass("productTitle").text();
    }*/
}
