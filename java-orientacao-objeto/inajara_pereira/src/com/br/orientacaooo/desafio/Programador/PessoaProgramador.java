package com.br.orientacaooo.desafio.Programador;

public abstract class PessoaProgramador {

    private final String nome;
    private final int idade;

    public PessoaProgramador(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String showInfo() {
        return this.nome + "\n" + this.idade + "\n";
    }
}
