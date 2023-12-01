package Prova;

import Prova.Categoria;

public class Produto extends Categoria {

    private String nomeProduto;
    private Double precoProduto;
    private String descProduto;
    private int estoqueAtual;
    private String descCategoria;
    private String produto;

        public Produto() {
            super();
            this.nomeProduto = nomeProduto;
                this.precoProduto = precoProduto;
                this.descProduto = descProduto;
                this.estoqueAtual = estoqueAtual;
                this.descCategoria = descCategoria;
        }

        public Produto(String produto) {
                this.produto = produto;
        }

        public String getNomeProduto() {
                return nomeProduto;
        }

        public void setNomeProduto(String nomeProduto) {
                this.nomeProduto = nomeProduto;
        }

        public Double getPrecoProduto() {
                return precoProduto;
        }

        public void setPrecoProduto(Double precoProduto) {
                this.precoProduto = precoProduto;
        }

        public String getDescProduto() {
                return descProduto;
        }

        public void setDescProduto(String descProduto) {
                this.descProduto = descProduto;
        }

        public int getEstoqueAtual() {
                return estoqueAtual;
        }

        public void setEstoqueAtual(int estoqueAtual) {
                this.estoqueAtual = estoqueAtual;
        }

        public String getDescCategoria() {
                return descCategoria;
        }

        public void setDescCategoria(String descCategoria) {
                this.descCategoria = descCategoria;
        }

        public String getProduto() {
                return produto;
        }

        public void setProduto(String produto) {
                this.produto = produto;
        }

        public void InserirProduto(String nomeProduto, Double precoProduto, String descProduto, int estoqueAtual, String descCategoria){

        }

        public boolean buscarProduto(String nomeProduto){
                if (produto == nomeProduto){
                        return true;
                }
                else {
                        return false;
                }
        }

}
