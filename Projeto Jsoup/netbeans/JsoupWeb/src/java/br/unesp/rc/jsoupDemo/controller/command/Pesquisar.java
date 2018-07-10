package br.unesp.rc.jsoupDemo.controller.command;

import br.unesp.rc.jsoupDemo.model.Produto;
import br.unesp.rc.jsoupDemo.service.AmericanasService;
import br.unesp.rc.jsoupDemo.service.MagazineLuizaService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Pesquisar implements ICommand{
    public Pesquisar(){
        
    }
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String page = "sistema.jsp";
        String palavra = request.getParameter("palavra");
        HttpSession session = request.getSession(true);
        
        AmericanasService as = new AmericanasService();
        MagazineLuizaService magalu = new MagazineLuizaService();
        try {
            as.pesquisar(palavra);
            magalu.pesquisar(palavra);
            
            session.setAttribute("produtoAmericanas", as.arrayProdutos.get(0));
            session.setAttribute("produtoMagalu", magalu.arrayProdutos.get(0));
        } catch (Exception ex) {
            return ex.getMessage();
        }
        
        return page;
    }
    
}
