package com.br.orientacaooo.desafio.area;

class Circulo implements Forma{

    private double raio;

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(raio, 2);
    }
}
