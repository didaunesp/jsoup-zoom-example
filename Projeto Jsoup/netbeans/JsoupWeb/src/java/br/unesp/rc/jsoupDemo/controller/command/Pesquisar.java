/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.rc.jsoupDemo.controller.command;

import br.unesp.rc.jsoupDemo.model.Produto;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Daniel
 */
public class Pesquisar implements ICommand{
    public Pesquisar(){
        
    }
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String page = "sistema.jsp";
        String palavra = request.getParameter("palavra");
        HttpSession session = request.getSession(true);
        return page;
    }
    
}
