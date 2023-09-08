package Concessionaria;

public class Cliente {

    private String nome;
    private char endereco;
    private double cep;
    private int idade;

    public Cliente(String nome, char endereco, double cep, int idade) {
        this.nome = nome;
        this.endereco = endereco;
        this.cep = cep;
        this.idade = idade;
    }
}
