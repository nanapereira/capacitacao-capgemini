package com.br.orientacaooo.desafio.livro;

public abstract class Livro {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract String toString();
}
