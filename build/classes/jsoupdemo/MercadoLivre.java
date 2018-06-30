package jsoupdemo;

import java.io.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

public class MercadoLivre implements Site{

    @Override
    public void pesquisar() {
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
    
}
