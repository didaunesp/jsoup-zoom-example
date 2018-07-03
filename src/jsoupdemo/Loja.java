/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsoupdemo;

import java.util.ArrayList;
/**
 *
 * @author raduke
 */
abstract class Loja {
    ArrayList<String> Produtos = new ArrayList();
    public abstract void pesquisar();
    public abstract void setPrecoProduto();
    public abstract void setNomeProduto();
    public abstract void setPrecoNome();
}
