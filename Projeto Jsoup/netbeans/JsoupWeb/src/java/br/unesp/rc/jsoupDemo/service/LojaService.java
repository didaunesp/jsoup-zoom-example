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
    protected String loja;
    public ArrayList<Produto> arrayProdutos = new ArrayList();
    private ProdutoDAO pdao;
    
    public LojaService(){
        this.pdao = new ProdutoDAOImpl();
    }
    
    public void pesquisar(String busca) throws Exception{
        try
        {
            Document doc = Jsoup.connect(this.url+busca).get();
            Elements produtos = doc.getElementsByClass(this.classeProduto);
            for(Element item : produtos)
            {
                Produto produto = new Produto(this.getNomeProduto(item), this.getPrecoProduto(item), this.getImagemProduto(item), this.getLinkProduto(item));
                this.arrayProdutos.add(produto);
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
            String msgPesquisar = err.getMessage();
            msgPesquisar = msgPesquisar;
        }
    }
    public abstract Preco getPrecoProduto(Element item);
    public abstract String getNomeProduto(Element item);
    public abstract String getImagemProduto(Element item);
    public abstract String getLinkProduto(Element item);
    
    public void listaPrecoProdutos(String nome){
        this.arrayProdutos = this.pdao.lista(nome);
    }
}
