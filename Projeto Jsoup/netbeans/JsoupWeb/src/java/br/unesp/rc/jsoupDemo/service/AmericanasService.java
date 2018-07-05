package br.unesp.rc.jsoupDemo.service;

import br.unesp.rc.jsoupDemo.model.Loja;
import br.unesp.rc.jsoupDemo.model.Preco;
import java.io.*;
import java.util.Date;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

public class AmericanasService extends LojaService{
    
    public AmericanasService(){
        this.classeProduto = "product-grid-item";
        this.url = "https://www.americanas.com.br/busca/smartphone";
        this.loja = "Americanas";
    }

    @Override
    public Preco getPrecoProduto(Element item) {
        String preco = item.getElementsByClass("card-product-price").text();
        //OBTEM DATA ATUAL TODO: ENCAPSULAR EM UM HELPER
        //DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date data = new Date();
        //String hoje = dateFormat.format(date);
        return new Preco(preco, data, new Loja(this.loja));
    }

    @Override
    public String getNomeProduto(Element item) {
       return item.getElementsByClass("card-product-name").text();
    }
}