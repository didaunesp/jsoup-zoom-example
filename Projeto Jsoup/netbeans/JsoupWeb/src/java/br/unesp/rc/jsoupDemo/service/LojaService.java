package br.unesp.rc.jsoupDemo.service;

import br.unesp.rc.jsoupDemo.dao.ProdutoDAO;
import br.unesp.rc.jsoupDemo.dao.ProdutoDAOImpl;
import br.unesp.rc.jsoupDemo.model.Preco;
import br.unesp.rc.jsoupDemo.model.Produto;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

abstract class LojaService {

    protected String classeProduto;
    protected String urlBusca;
    protected String nomeLoja;
    protected String urlLoja;
    protected int idLoja;
    public ArrayList<Produto> arrayProdutos = new ArrayList();
    private ProdutoDAO pdao;

    public LojaService() {
        this.pdao = new ProdutoDAOImpl();
    }

    public void pesquisar(String busca) throws Exception, SQLException {
        Document doc = Jsoup.connect(this.getUrl(busca)).userAgent("Chrome").get();
        Elements produtos = doc.getElementsByClass(this.classeProduto);
        for (Element item : produtos) {
            Produto produto = new Produto(this.getNomeProduto(item), this.getPrecoProduto(item), this.getImagemProduto(item));
            this.arrayProdutos.add(produto);
            if (!this.pdao.salvar(produto)) {
                throw new Exception("Erro ao salvar produto");
            }
        }
    }

    public abstract Preco getPrecoProduto(Element item);

    public abstract String getNomeProduto(Element item);

    public abstract String getImagemProduto(Element item);

    public abstract String getUrl(String busca);

    public void listaPrecoProdutos(String nome) throws SQLException, ClassNotFoundException {
        this.arrayProdutos = this.pdao.lista(nome);
    }

    public int pegaMenorPreco() {
        int indiceMenorPreco = 0;
        String valor0 = this.arrayProdutos.get(0).preco.getPreco().replace("R$", "");
        
        if (this.nomeLoja == "Magazineluiza") {
            valor0 = valor0.replace("por", "");
        }
        
        valor0 = valor0.replace(",", "");
        Double menor = Double.parseDouble(valor0.trim());
        
        for (int i = 0; i < this.arrayProdutos.size(); i++) {
            if (this.arrayProdutos.get(i).preco.getPreco() == "Produto indisponível"){
                continue;
            }
            
            String valor1 = this.arrayProdutos.get(i).preco.getPreco().replace("R$", "");
            
            if (this.nomeLoja == "Magazineluiza") {
                valor1 = valor1.replace("por", "");
            }
            
            valor1 = valor1.replace(",", "");
            Double valor2 = Double.parseDouble(valor1.trim());
            
            if (valor2 < menor) {
                menor = valor2;
                indiceMenorPreco = i;
            }
        }
        
        return indiceMenorPreco;
    }

}
