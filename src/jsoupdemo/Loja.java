/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsoupdemo;

import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.*;
/**
 *
 * @author raduke
 */
abstract class Loja {
    ArrayList<Produto> produtos = new ArrayList();
    public abstract void pesquisar();
    public abstract String getPrecoProduto(Element item);
    public abstract String getNomeProduto(Element item);
}
