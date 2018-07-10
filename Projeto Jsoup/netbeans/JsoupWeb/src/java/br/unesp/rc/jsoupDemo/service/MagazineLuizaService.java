package br.unesp.rc.jsoupDemo.service;

import br.unesp.rc.jsoupDemo.model.Preco;
import br.unesp.rc.jsoupDemo.model.Loja;
import java.io.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

public class MagazineLuizaService extends LojaService {

    public MagazineLuizaService() {
        super();
        this.classeProduto = "product";
        this.url = "https://www.magazineluiza.com.br/busca/";
        this.loja = "Magazine Luiza";
    }

    @Override
    public String getNomeProduto(Element item) {
        return item.getElementsByClass("productTitle").text();
    }

    @Override
    public Preco getPrecoProduto(Element item) {
        String preco = item.getElementsByClass("price").text();
        String link = item.getElementsByClass("product-li").attr("href");
        Date data = new Date();
        if (preco.isEmpty()) {
            return new Preco("Produto indisponível", data, new Loja(this.loja), link);
        } else {
            String precoOriginal = item.getElementsByClass("originalPrice").text();
            if (!precoOriginal.isEmpty()) {
                return new Preco(precoOriginal + "\n" + preco, data, new Loja(this.loja), link);
            } else {
                return new Preco(preco, data, new Loja(this.loja), link);
            }
        }
    }

    @Override
    public String getImagemProduto(Element item) {
        return item.getElementsByClass("product-image").attr("data-original");
    }
}
