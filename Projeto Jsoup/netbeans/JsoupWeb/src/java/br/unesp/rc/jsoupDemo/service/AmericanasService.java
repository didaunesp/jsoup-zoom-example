package br.unesp.rc.jsoupDemo.service;

import br.unesp.rc.jsoupDemo.model.Loja;
import br.unesp.rc.jsoupDemo.model.Preco;
import java.io.*;
import java.sql.Date;
import java.util.Calendar;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

public class AmericanasService extends LojaService{
    
    public AmericanasService(){
        super();
        this.classeProduto = "product-grid-item";
        this.urlBusca = "https://www.americanas.com.br/busca/";
        this.nomeLoja = "Americanas";
        this.idLoja = 2;
        this.urlLoja = "https://www.americanas.com.br";
    }

    @Override
    public Preco getPrecoProduto(Element item) {
        String preco = item.getElementsByClass("card-product-price").text();
        String urlProduto = "https://www.americanas.com.br" + item.getElementsByClass("card-product-url").attr("href");
        //OBTEM DATA ATUAL TODO: ENCAPSULAR EM UM HELPER
        //DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date data = new Date(Calendar.getInstance().getTime().getTime());
        //String hoje = dateFormat.format(date);
        return new Preco(preco, data, new Loja(this.nomeLoja, this.urlLoja, this.idLoja), urlProduto);
    }

    @Override
    public String getNomeProduto(Element item) {
       return item.getElementsByClass("card-product-name").text();
    }

    @Override
    public String getImagemProduto(Element item) {
        return item.getElementsByClass("card-product-picture").attr("src");
    }
    
    @Override
    public String getUrl(String busca)
    {
        busca = busca.replace(' ', '-');
        return this.urlBusca + busca;
    }
}