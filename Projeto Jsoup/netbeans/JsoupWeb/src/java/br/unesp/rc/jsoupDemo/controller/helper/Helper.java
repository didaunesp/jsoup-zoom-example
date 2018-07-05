/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.rc.jsoupDemo.controller.helper;

import br.unesp.rc.jsoupDemo.controller.command.ICommand;

public class Helper {

    private Helper() {
    }

    public static ICommand getCommand(String cmd) {
        ICommand command = null;

        switch (cmd) {
            case "/buscar": {
                System.out.println("Comando criado!");
                //command = new EfetuarLogin();
            }
            default: {
                System.out.println("Commando não encontrado!");
            }
        }

        return command;
    }

}

