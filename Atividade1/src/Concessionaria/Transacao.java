package Concessionaria;

public class Transacao {

    private char form_pgto;
    private double valor;
    private String nome;

    public Transacao(char form_pgto, double valor, String nome) {
        this.form_pgto = form_pgto;
        this.valor = valor;
        this.nome = nome;
    }
}
