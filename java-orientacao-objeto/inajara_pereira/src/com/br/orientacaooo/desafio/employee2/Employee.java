package com.br.orientacaooo.desafio.employee2;

public class Employee {

    private String name;
    private Integer hours;
    private Double valuePerHour;

    public Employee(String name, int hours, Double valuesPerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuesPerHour;

    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Double payment(){
        return this.valuePerHour * this.hours;
    }

    @Override
    public String toString() {
        return String.format("{Nome = %s , Pagamento= R$ %.2f}" ,name , payment());
    }
}
