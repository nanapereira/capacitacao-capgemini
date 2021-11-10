package com.br.orientacaooo.desafio.employee2;

public class OutsourceEmployee extends Employee {

    private Double additionalCharge;

    public OutsourceEmployee(String name, int hours, Double valuesPerHour, Double additionalCharge) {
        super(name, hours, valuesPerHour);
        this.additionalCharge = additionalCharge;
    }

    public OutsourceEmployee(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double payment() {
        return super.payment() + (1.10 * additionalCharge);
    }
}
