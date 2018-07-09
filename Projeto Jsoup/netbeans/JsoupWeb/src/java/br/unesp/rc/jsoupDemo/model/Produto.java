package br.unesp.rc.jsoupDemo.model;

public class Produto {
    private String nome;
    private String imagem;

    public Preco preco;
    
    public Produto(String nome, Preco preco, String imagem){
        this.setNome(nome);
        this.setPreco(preco);
        this.setImagem(imagem);
    }
    
    public void setPreco(Preco preco){
        this.preco = preco;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public Preco getPreco(){
        return this.preco;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
}
