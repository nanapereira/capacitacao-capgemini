package com.br.orientacaooo.desafio.tax;

public class Individual extends TaxPayer {

    private Double healthExpenditures;

    public Individual(String name, Double anualIncome) {
        super(name, anualIncome);
    }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        double tax;
        if (getAnualIncome() < 20000.00) {
            tax = (getAnualIncome() * 0.15);
        } else {
            tax = (getAnualIncome() * 0.25);
        }
        if (healthExpenditures != null) {
            tax -= (healthExpenditures * 0.5);
        }
        return tax;
    }

    @Override
    public String toString() {
        return String.format("TaxPayer {Nome = %s , anualIncome= R$ %.2f , healthExpenditures= R$ %.2f}",
                this.getName(), this.getAnualIncome(), this.healthExpenditures);
    }
}