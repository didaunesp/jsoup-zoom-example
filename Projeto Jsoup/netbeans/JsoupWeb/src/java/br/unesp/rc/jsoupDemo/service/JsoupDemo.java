package br.unesp.rc.jsoupDemo.service;

public class JsoupDemo {

    public static void main(String[] args) {
        System.out.println("------------------ MERCADO LIVRE ------------------");
        MercadoLivre mercliv = new MercadoLivre();
        mercliv.pesquisar();
        
        System.out.println("------------------- AMERICANAS --------------------");
        Americanas amer = new Americanas();
        amer.pesquisar();
        
        System.out.println("------------------ MAGAZINELUIZA ------------------");
        MagazineLuiza magalu = new MagazineLuiza();
        magalu.pesquisar();
    }
    
}
