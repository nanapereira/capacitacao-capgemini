package com.br.orientacaooo.desafio.account;

public class Account {

    private final Integer number;
    private String holder;
    private double balance = 0.0;

    public Account(Integer number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposite(Double ammount) {
        this.balance += ammount;
    }

    public void withdraw(Double ammount) {
        double saldo = this.balance - (ammount + 5.00);
        if (saldo > 0) {
            this.balance -= (ammount + 5.00);
        }
    }

    @Override
    public String toString() {
        return "\nAccount{" +
                "number=" + number +
                ", holder='" + holder + '\'' +
                ", balance=" + balance +
                '}';
    }
}
