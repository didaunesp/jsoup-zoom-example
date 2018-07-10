package br.unesp.rc.jsoupDemo.controller.command;

import br.unesp.rc.jsoupDemo.model.Produto;
import br.unesp.rc.jsoupDemo.service.AmericanasService;
import br.unesp.rc.jsoupDemo.service.MagazineLuizaService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ListarTodos implements ICommand{
    public ListarTodos(){
        
    }
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String page = "conteudoListaTudo.jsp";
        String palavra = request.getParameter("prod");
        HttpSession session = request.getSession(true);
        
        AmericanasService as = new AmericanasService();
        MagazineLuizaService magalu = new MagazineLuizaService();
        try {
            as.pesquisar(palavra);
            magalu.pesquisar(palavra);
            
            session.setAttribute("produtoAmericanas", as);
            session.setAttribute("produtoMagalu", magalu);
        } catch (Exception ex) {
            session.setAttribute("erro", ex.getMessage());
            page = "erro.jsp";
        }
        
        return page;
    }
    
}
