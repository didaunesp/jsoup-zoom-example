package jsoupdemo;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

public class MagazineLuiza extends Loja{

    @Override
    public void pesquisar() {
        String url = "https://www.magazineluiza.com.br/busca/smartphone";
        
        try
        {
            Document doc = Jsoup.connect(url).get();
            Elements produtos = doc.getElementsByClass("product");
            for(Element item : produtos)
            {
                this.setNomeProduto();
                //Elements precoOriginal = item.getElementsByClass("originalPrice");
                this.setPrecoProduto();
                if (!precoOriginal.isEmpty()) {
                    String precoAtual = item.getElementsByClass("price").text();
                    System.out.println(precoOriginal.text() + " " + precoAtual);
                } else {
                    System.out.println("Produto indisponível");
                }
            }
        }
        catch(IOException err)
        {
            System.out.print(err.getMessage());
        }
    }

    @Override
    public void setPrecoProduto() {
        String url = "https://www.magazineluiza.com.br/busca/smartphone";
        Document doc;
        try {
            doc = Jsoup.connect(url).get();
            Elements produtos = doc.getElementsByClass("product");
            for(Element item : produtos)
        {
            this.preco = item.getElementsByClass("price").text();
            if(!this.preco.isEmpty()){
                this.preco = item.getElementsByClass("price").text();;
            } else {
                this.preco = "Produto indisponível";
            }
        }
        } catch (IOException err) {
            System.out.print(err.getMessage());
        }
    }

    @Override
    public void setNomeProduto() {
        String url = "https://www.magazineluiza.com.br/busca/smartphone";
        
        try
        {
            Document doc = Jsoup.connect(url).get();
            Elements produtos = doc.getElementsByClass("product");
            for(Element item : produtos)
            {
                this.nome = item.getElementsByClass("productTitle").text();
            }
        }
        catch(IOException err)
        {
            System.out.print(err.getMessage());
        }
    }

    @Override
    public void setPrecoNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
