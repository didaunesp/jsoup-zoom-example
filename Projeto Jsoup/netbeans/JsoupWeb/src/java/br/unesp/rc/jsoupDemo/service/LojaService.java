package br.unesp.rc.jsoupDemo.service;

import br.unesp.rc.jsoupDemo.dao.ProdutoDAO;
import br.unesp.rc.jsoupDemo.dao.ProdutoDAOImpl;
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
    private ProdutoDAO pdao;
    
    public LojaService(){
        this.pdao = new ProdutoDAOImpl();
    }
    
    public void pesquisar() throws Exception{
        try
        {
            Document doc = Jsoup.connect(this.url).get();
            Elements produtos = doc.getElementsByClass(this.classeProduto);
            for(Element item : produtos)
            {
                Produto produto = new Produto(this.getNomeProduto(item), this.getPrecoProduto(item));
                this.produtos.add(produto);
                if(!this.pdao.salvar(produto)){
                 throw new Exception("Erro ao salvar produto");
                }
            }
        }
        catch(IOException err)
        {
            System.out.print(err.getMessage());
        }
        catch(Exception err){
            System.out.print(err.getMessage());
        }
    }
    public abstract Preco getPrecoProduto(Element item);
    public abstract String getNomeProduto(Element item);
}
