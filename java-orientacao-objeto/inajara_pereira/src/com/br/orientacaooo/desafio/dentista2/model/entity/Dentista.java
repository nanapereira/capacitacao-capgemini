package com.br.orientacaooo.desafio.dentista2.model.entity;

public class Dentista extends Pessoa {

    private int codigo;
    private String especialidade;
    private String registro;
    private boolean ativo;

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
