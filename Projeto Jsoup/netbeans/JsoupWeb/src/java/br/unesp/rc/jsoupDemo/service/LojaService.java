package br.unesp.rc.jsoupDemo.service;

import br.unesp.rc.jsoupDemo.model.Preco;
import br.unesp.rc.jsoupDemo.model.Produto;
import java.io.IOException;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

abstract class LojaService {
    
    protected String classeProduto;
    protected String url;
    public ArrayList<Produto> produtos = new ArrayList();
    
    public void pesquisar(){
        try
        {
            Document doc = Jsoup.connect(this.url).get();
            Elements produtos = doc.getElementsByClass(this.classeProduto);
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
    public abstract Preco getPrecoProduto(Element item);
    public abstract String getNomeProduto(Element item);
}
