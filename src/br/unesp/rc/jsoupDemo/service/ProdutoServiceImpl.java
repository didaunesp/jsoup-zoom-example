/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.rc.jsoupDemo.service;

import br.unesp.rc.jsoupDemo.model.Produto;
import br.unesp.rc.jsoupDemo.dao.ProdutoDAOImpl;

/**
 *
 * @author raduke
 */
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
