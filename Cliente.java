package br.com.restaurante;
import java.util.Scanner;

public class Cliente {
    // Atributos privados
    private String nome;
    private String endereco;
    private String telefone;

    // Construtor com parâmetros
    public Cliente (String nome, String endereco, String telefone){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    // Método registrarCliente()
    public void registrarCliente(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    // Métodos getter e setter
    // Nome
    public String getNome(String nome){
        return nome;
    }

    public void setNome(String nome[]) {
        this.nome = nome;
    }

    // Endereço
    public String getEndereco(String endereco[]){
        return endereco;
    }

    public void setEndereco(String endereco[]) {
        this.endereco = endereco;
    }

    // Telefone
    public int getTelefone(String telefone){
        return telefone;
    }

    public void setTelefone(String telefone[]) {
        this.telefone = telefone;
    }

    // Método visualizarCliente()
    public void visualizarCliente(){
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
    }

}