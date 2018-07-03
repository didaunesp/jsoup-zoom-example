package jsoupdemo;

import java.io.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

public class Americanas extends Loja{
    
    @Override
    public void pesquisar(){
        String url = "https://www.americanas.com.br/busca/smartphone";
        
        try
        {
            Document doc = Jsoup.connect(url).get();
            Elements produtos = doc.getElementsByClass("product-grid-item");
            for(Element item : produtos)
            {
                String nome = item.getElementsByClass("card-product-name").text();
                System.out.println(nome);
                String preco = item.getElementsByClass("card-product-price").text();
                System.out.println(preco);
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
