package com.br.orientacaooo.model.entity;

public class Produto {

    private int codigoProduto;
    private double precoProduto;
    private String descricaoProduto;

    public Produto() {
    }

    public Produto(int codigoProduto, double precoProduto, String descricaoProduto) {
        this.codigoProduto = codigoProduto;
        this.precoProduto = precoProduto;
        this.descricaoProduto = descricaoProduto;
    }

    public Produto(double preco_produto, String descricao_produto) {
    }

    public Produto(int codigoProduto) {
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    @Override
    public String toString() {
        return "\nProduto{" +
                "codigoProduto=" + codigoProduto +
                ", descricaoProduto='" + descricaoProduto + '\'' +
                ", precoProduto=" + precoProduto +
                '}';
    }
}
