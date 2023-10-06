package br.com.pagamento;

public class cartaoCredito extends Pagamento{

    private String numeroCartao;
    private String bandeiraCartao;
    private String titularCartao;

    public cartaoCredito(String dataHoraPagamento, int numeroPagamento, double valorPago, String numeroCartao, String bandeiraCartao, String titularCartao) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.numeroCartao = numeroCartao;
        this.bandeiraCartao = bandeiraCartao;
        this.titularCartao = titularCartao;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getBandeiraCartao() {
        return bandeiraCartao;
    }

    public void setBandeiraCartao(String bandeiraCartao) {
        this.bandeiraCartao = bandeiraCartao;
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
                "\n Numero do Cartão: " + getNumeroCartao() +
                "\n Titular do Cartão: " + getTitularCartao();

    }

}
