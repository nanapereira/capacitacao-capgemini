package com.br.orientacaooo.model.entity;

public abstract class Animal implements AnimalInterface {

    protected String nomeAnimal;
    protected String especie;
    protected String raca;
    protected String cor;
    protected int idadeEmMeses;
    protected String sexo;
    protected String som;
    protected boolean vivo;

    public Animal() {
        System.out.println("objeto construido");
    }

    public Animal(String nomeAnimal, String especie, String raca, String cor, String sexo, String som, boolean isVivo) {
        this.nomeAnimal = nomeAnimal;
        this.especie = especie;
        this.raca = raca;
        this.cor = cor;
        this.sexo = sexo;
        this.som = som;
        this.vivo = isVivo;
    }

    public void setIdadeEmMeses(int idadeEmMeses) {
        this.idadeEmMeses = idadeEmMeses;
    }

    public boolean isVivo(){
        return vivo;
    }

}
