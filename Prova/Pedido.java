package Prova;

import Prova.Categoria;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
public class Pedido extends PedidoItem {

    private int numeroPedido;
    private Date dataHoraPedido;
    private double precoTotal;
    private int statusPedido;
    private int Pedido;

    List<String> PedidosItem = new ArrayList<String>();

    public Pedido(int numeroPedido, Date dataHoraPedido, double precoTotal, int statusPedido) {
        super();
        this.numeroPedido = numeroPedido;
        this.dataHoraPedido = dataHoraPedido;
        this.precoTotal = precoTotal;
        this.statusPedido = statusPedido;
    }

    public Pedido(int pedido) {
        super();
        Pedido = pedido;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Date getDataHoraPedido() {
        return dataHoraPedido;
    }

    public void setDataHoraPedido(Date dataHoraPedido) {
        this.dataHoraPedido = dataHoraPedido;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public int getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(int statusPedido) {
        this.statusPedido = statusPedido;
    }

    public int getPedido() {
        return Pedido;
    }

    public void setPedido(int pedido) {
        Pedido = pedido;
    }

    public void inserirPedido(int numeroPedido, Date dataHoraPedido, double precoTotal, int statusPedido){
    }

    public void alterarStatus(int statusPedido){
        System.out.println("Status do Prova.Pedido Alterado");
    }

    public boolean consultarPedido(int numeroPedido){
        if (Pedido == numeroPedido){
            return true;
        }
        else {
            System.out.println("Numero do Prova.Pedido Invalido");
            return false;
        }
    }
    public void inserirItensPedido(PedidoItem pedidoItem){
        this.PedidosItem.add(Produto);
        this.CalculoValorTotal;
    }

    public void excluirItensPedido(){
        this.PedidosItem.remove(Pedido);
        this.CalculoValorTotal;
    }



}
