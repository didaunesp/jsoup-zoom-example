/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.rc.jsoupDemo.controller.command;

import br.unesp.rc.jsoupDemo.service.AmericanasService;
import br.unesp.rc.jsoupDemo.service.MagazineLuizaService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author raduke
 */
public class Listar implements ICommand{
    public Listar(){
        
    }
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String page = "listagem.jsp";
        String produto = request.getParameter("produto");
        HttpSession session = request.getSession(true);
        
        AmericanasService as = new AmericanasService();
        MagazineLuizaService magalu = new MagazineLuizaService();
        try {
            as.listaPrecoProdutos(produto);
            magalu.listaPrecoProdutos(produto);
            
            session.setAttribute("produtoAmericanas", as);
            session.setAttribute("produtoMagalu", magalu);
        } catch (Exception ex) {
            session.setAttribute("erro", ex.getMessage());
            page = "erro.jsp";
        }
        
        return page;
    }
}
