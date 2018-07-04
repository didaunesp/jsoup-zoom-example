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
                Produto produto = new Produto(this.getNomeProduto(item), this.getPrecoProduto(item));
                this.produtos.add(produto);
                //Elements precoOriginal = item.getElementsByClass("originalPrice");
                /*if (!precoOriginal.isEmpty()) {
                    String precoAtual = item.getElementsByClass("price").text();
                    System.out.println(precoOriginal.text() + " " + precoAtual);
                } else {
                    System.out.println("Produto indisponível");
                }*/
            }
        }
        catch(IOException err)
        {
            System.out.print(err.getMessage());
        }
    }

    @Override
    public String getPrecoProduto(Element item) {
            String preco = item.getElementsByClass("price").text();
            if(preco.isEmpty()){
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
