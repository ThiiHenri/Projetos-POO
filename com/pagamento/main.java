package br.com.pagamento;

public class main {
    public static void main(String[] args) {

        cartaoCredito cc = new cartaoCredito("01/01/2023",121314,50,"5124674","Mastercard","Thiago");
        System.out.println("\n Imprimir Cupom Fiscal: " + cc.imprimirCupomFiscal());

        Pix px = new Pix("12/11/2021",145,25,true);
        System.out.println("\n Imprimir Cupom Fiscal: " + px.imprimirCupomFiscalPix());

        cartaoDebito cd = new cartaoDebito("19/102021",125,78,"14254","Thiago");
        System.out.println("\n Imprimir Cupom Fiscal: " + cd.imprimirCupomFiscal());
    }
}
