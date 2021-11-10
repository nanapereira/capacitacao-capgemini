package com.br.orientacaooo.model.entity;

import java.util.Objects;

public class Girafa extends Animal {

    private final int tamanhoPescoco;

    public Girafa(int tamanhoPescoco) {
        this.tamanhoPescoco = tamanhoPescoco;
    }

    public Girafa(String nomeAnimal, String raca, String cor, String sexo, int tamanhoPescoco, boolean isVivo) {
        super(nomeAnimal, "Girafa", raca, cor, sexo, "fiu fiu", isVivo);
        this.tamanhoPescoco = tamanhoPescoco;
    }

    @Override
    public String emitirSom() {
        return this.som;
    }

    @Override
    public boolean isAdulto() {
        if (vivo) {
            if (Objects.equals(this.sexo, "femea")){
                return this.idadeEmMeses >= 48;
            } else if (Objects.equals(this.sexo, "macho")){
                return this.idadeEmMeses > 60;
            }
            return false;
        }
        return false;
    }

    @Override
    public void matarAnimal() {
        this.som = "morto";
        this.vivo = false;
    }
}
