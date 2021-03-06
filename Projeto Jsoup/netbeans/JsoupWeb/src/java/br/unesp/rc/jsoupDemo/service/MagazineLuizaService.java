package br.unesp.rc.jsoupDemo.service;

import br.unesp.rc.jsoupDemo.model.Preco;
import br.unesp.rc.jsoupDemo.model.Loja;
import java.io.*;
import java.sql.Date;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

public class MagazineLuizaService extends LojaService {

    public MagazineLuizaService() {
        super();
        this.classeProduto = "product";
        this.urlBusca = "https://www.magazineluiza.com.br/busca/";
        this.nomeLoja = "Magazineluiza";
        this.idLoja = 1;
        this.urlLoja = "https://www.magazineluiza.com.br";
    }

    @Override
    public String getNomeProduto(Element item) {
        return item.getElementsByClass("productTitle").text();
    }

    @Override
    public Preco getPrecoProduto(Element item) {
        String preco = item.getElementsByClass("price").text();
        String urlProduto = item.getElementsByClass("product-li").attr("href");
        Date data = new Date(Calendar.getInstance().getTime().getTime());
        if (preco.isEmpty()) {
            return new Preco("Produto indisponível", data, new Loja(this.nomeLoja, this.urlLoja, this.idLoja), urlProduto);
        } else {            
            return new Preco(preco, data, new Loja(this.nomeLoja, this.urlLoja, this.idLoja), urlProduto);
        }
    }

    @Override
    public String getImagemProduto(Element item) {
        return item.getElementsByClass("product-image").attr("data-original");
    }
    
    @Override
    public String getUrl(String busca)
    {
        return this.urlBusca + busca;
    }
}
