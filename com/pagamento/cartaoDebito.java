package br.com.pagamento;

public class cartaoDebito extends Pagamento {

    private String numCartao;
    private String titularCartao;

    public cartaoDebito(String dataHoraPagamento, int numeroPagamento, double valorPago, String numCartao, String titularCartao) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.numCartao = numCartao;
        this.titularCartao = titularCartao;
    }

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public String getTitularCartao() {
        return titularCartao;
    }

    public void setTitularCartao(String titularCartao) {
        this.titularCartao = titularCartao;
    }

    public String imprimirCupomFiscal(){
        return "Data e Hora do pagamento: " + getDataHoraPagamento() +
                "\n Numero do Pagamento: " + getNumeroPagamento() +
                "\n Valor pago: " + getValorPago() +
                "\n Numero do Cartão: " + getNumCartao() +
                "\n Titular do Cartão: " + getTitularCartao();

    }

}
