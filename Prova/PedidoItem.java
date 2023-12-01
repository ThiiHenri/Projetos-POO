package Prova;

public class PedidoItem extends Produto {

    private String nomeItem;
    private int qtdIitem;
    private double precoItem;

    public PedidoItem() {
        super();
        this.nomeItem = nomeItem;
        this.qtdIitem = qtdIitem;
        this.precoItem = precoItem;
    }

    public PedidoItem(String produto, String nomeItem, int qtdIitem, double precoItem) {
        super();
        this.nomeItem = nomeItem;
        this.qtdIitem = qtdIitem;
        this.precoItem = precoItem;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public int getQtdIitem() {
        return qtdIitem;
    }

    public void setQtdIitem(int qtdIitem) {
        this.qtdIitem = qtdIitem;
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }
}
