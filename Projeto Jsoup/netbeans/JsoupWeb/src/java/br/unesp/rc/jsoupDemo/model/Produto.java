package br.unesp.rc.jsoupDemo.model;

public class Produto {
    private String nome;
    private String imagem;
    private String linkProduto;

    public String getLinkProduto() {
        return linkProduto;
    }

    public void setLinkProduto(String linkProduto) {
        this.linkProduto = linkProduto;
    }

    public Preco preco;
    
    public Produto(String nome, Preco preco, String imagem, String link){
        this.setNome(nome);
        this.setPreco(preco);
        this.setImagem(imagem);
        this.setLinkProduto(link);
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
