package com.br.orientacaooo.desafio.pessoa;

public class Pessoa {

    private final String nome;
    private int idade;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "nome= " + nome + "\n" + "idade= " + idade;
    }
}
