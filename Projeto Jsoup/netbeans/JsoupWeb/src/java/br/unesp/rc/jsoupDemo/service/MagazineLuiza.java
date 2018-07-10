package br.unesp.rc.jsoupDemo.service;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

public class MagazineLuiza extends Loja {

    public MagazineLuiza() {
        this.classeProduto = "product";
        this.url = "https://www.magazineluiza.com.br/busca/smartphone";
    }

    @Override
    public String getPrecoProduto(Element item) {
        String preco = item.getElementsByClass("price").text();
        if (preco.isEmpty()) {
            return preco;
        } else {
            return "Produto indisponível";
        }
    }

    @Override
    public String getNomeProduto(Element item) {
        return item.getElementsByClass("productTitle").text();
    }
}
