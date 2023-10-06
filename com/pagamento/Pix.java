package br.com.pagamento;

public class Pix extends Pagamento{

    private boolean comprovanteTransacaoPix;

    public Pix(String dataHoraPagamento, int numeroPagamento, double valorPago, boolean comprovanteTransacaoPix) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.comprovanteTransacaoPix = comprovanteTransacaoPix;
    }

    public boolean isComprovanteTransacaoPix() {
        return comprovanteTransacaoPix;
    }

    public void setComprovanteTransacaoPix(boolean comprovanteTransacaoPix) {
        this.comprovanteTransacaoPix = comprovanteTransacaoPix;
    }

    public String imprimirCupomFiscalPix(){
        return "Data e Hora do pagamento: " + getDataHoraPagamento() +
                "\n Numero do Pagamento: " + getNumeroPagamento() +
                "\n Valor pago: " + getValorPago();
    }

}
