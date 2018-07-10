package br.unesp.rc.jsoupDemo.service;

import br.unesp.rc.jsoupDemo.model.Produto;
import java.sql.SQLException;

public interface ProdutoService {
    public void salvar(Produto produto) throws SQLException, ClassNotFoundException;
}
