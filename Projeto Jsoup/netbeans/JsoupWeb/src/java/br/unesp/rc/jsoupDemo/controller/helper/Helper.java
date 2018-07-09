package br.unesp.rc.jsoupDemo.controller.helper;

import br.unesp.rc.jsoupDemo.controller.command.ICommand;
import br.unesp.rc.jsoupDemo.controller.command.Pesquisar;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Helper {

    private Helper() {
    }

    public static ICommand getCommand(String cmd) {
        ICommand command = null;

        switch (cmd) {
            case "/Pesquisar": {
                System.out.println("Comando criado!");
                command = new Pesquisar();
            }
            break;
            default: {
                System.out.println("Commando não encontrado!");
            }
        }

        return command;
    }

}
