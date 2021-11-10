package com.br.orientacaooo.desafio.product;

public class ImportedProduct extends Product {

    private Double customsFee;

    public ImportedProduct(Double customsFee) {
        this.customsFee = customsFee;
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double totalPrice() {
        return getPrice() + this.customsFee;
    }

    @Override
    public String priceTag() {
        return String.format("{Nome = %s , preço= R$ %.3f}", this.getName(), this.totalPrice());
    }

}
