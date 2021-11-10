package com.br.orientacaooo.model.entity;

public class Gato extends Animal {
    public Gato(String nomeAnimal, String raca, String cor, String sexo, boolean vivo) {
        super(nomeAnimal, "Gato", raca, cor, sexo, "miau miau",vivo);
    }

    @Override
    public String emitirSom() {
        return this.som;
    }

    @Override
    public boolean isAdulto() {
        return idadeEmMeses > 12;
    }

    @Override
    public void matarAnimal() {
        this.som = "morto";
        this.vivo = false;
    }

}
