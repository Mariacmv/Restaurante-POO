package br.com.restaurante;
public class ItemMenu {
    private String nome;
    private String categoria;
    private double preco;

    public ItemMenu(String nome, String categoria, double preco){
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }
    public String setDetalhesItem(String nome, String categoria, double preco){
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        return nome;
    }
    public String getDetalhesItem(){
        return "Nome: "+nome+ ", Categoria: " +categoria+ ", Preçço: " +preco;
    }

    public double calcularPreco(){
        return preco;
    }
}
