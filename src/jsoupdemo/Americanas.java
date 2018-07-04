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
                Produto produto = new Produto(this.getNomeProduto(item), this.getPrecoProduto(item));
                this.produtos.add(produto);
            }
        }
        catch(IOException err)
        {
            System.out.print(err.getMessage());
        }
    }

    @Override
    public String getPrecoProduto(Element item) {
        return item.getElementsByClass("card-product-price").text();
    }

    @Override
    public String getNomeProduto(Element item) {
       return item.getElementsByClass("card-product-name").text();
    }
}