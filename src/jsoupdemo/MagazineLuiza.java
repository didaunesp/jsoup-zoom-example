package jsoupdemo;

import java.io.*;
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
                String nome = item.getElementsByClass("productTitle").text();
                System.out.println(nome);
                Elements precoOriginal = item.getElementsByClass("originalPrice");
                
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
    public String buscaPreco() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String buscaNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String buscaPrecoNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
