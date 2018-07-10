package br.unesp.rc.jsoupDemo.service;

import br.unesp.rc.jsoupDemo.model.Preco;
import java.io.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

public class MercadoLivreService extends LojaService{

    @Override
    public void pesquisar(String busca) {
        String url = "https://lista.mercadolivre.com.br/smartphone";
        
        try
        {
            Document doc = Jsoup.connect(url).get();
            Elements produtos = doc.getElementsByClass("results-item");
            for(Element item : produtos)
            {
                String nome = item.getElementsByClass("main-title").first().text();
                System.out.println(nome);
                String preco = item.getElementsByClass("price__fraction").first().text();
                String moeda = item.getElementsByClass("price__symbol").first().text();
                System.out.println(moeda+preco);
            }
        }
        catch(IOException err)
        {
            System.out.print(err.getMessage());
        }
    }

    @Override
    public Preco getPrecoProduto(Element item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNomeProduto(Element item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    

    @Override
    public String getImagemProduto(Element item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getUrl(String busca) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
