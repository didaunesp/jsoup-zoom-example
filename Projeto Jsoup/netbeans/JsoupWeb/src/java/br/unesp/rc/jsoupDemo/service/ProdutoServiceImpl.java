package br.unesp.rc.jsoupDemo.service;

import br.unesp.rc.jsoupDemo.model.Produto;
import br.unesp.rc.jsoupDemo.dao.ProdutoDAOImpl;

public class ProdutoServiceImpl implements ProdutoService{
    
    private ProdutoDAOImpl pdao;
    
    public ProdutoServiceImpl(){
        this.pdao = new ProdutoDAOImpl();
    }
    
    @Override
    public void salvar(Produto produto) {
        this.pdao.salvar(produto);
    }
    
}
