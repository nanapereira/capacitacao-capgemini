package com.br.orientacaooo.model.entity;

public class Cachorro extends Animal {
    public Cachorro(String nomeAnimal, String raca,  String cor, String sexo, boolean vivo){
        super(nomeAnimal, "Cachorro", raca, cor, sexo, "au au", vivo);
    }

    @Override
    public String emitirSom() {
        return this.som;
    }

    @Override
    public boolean isAdulto() {
        return idadeEmMeses > 24;
    }

    @Override
    public void matarAnimal() {
        this.som = "morto";
        this.vivo = false;
    }

}
