/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsoupdemo;

import java.io.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

/**
 *
 * @author raduke
 */
public class JsoupDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String url;
        url = "https://lista.mercadolivre.com.br/smartphone";
        
        try
        {
            Document doc = Jsoup.connect(url).get();
            Elements produtos = doc.getElementsByClass("results-item");
            for(Element t : produtos)
            {
                String texto = t.getElementsByClass("main-title").first().text();
                System.out.println(texto);
                String preco = t.getElementsByClass("price__fraction").first().text();
                String moeda = t.getElementsByClass("price__symbol").first().text();
                System.out.println(moeda+preco);
            }
        }
        catch(IOException err)
        {
            System.out.print(err.getMessage());
        }
    }
    
}
