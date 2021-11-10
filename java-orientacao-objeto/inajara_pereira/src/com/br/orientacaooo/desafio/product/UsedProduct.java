package com.br.orientacaooo.desafio.product;

public class UsedProduct extends Product {

    private String manufactureDate;

    public UsedProduct(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public UsedProduct(String name, Double price, String manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public String getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        return String.format("{Nome= %s , Preço= R$ %.2f, Data de fabricação= %s}",
                this.getName(), this.getPrice(), this.manufactureDate);
    }
}
