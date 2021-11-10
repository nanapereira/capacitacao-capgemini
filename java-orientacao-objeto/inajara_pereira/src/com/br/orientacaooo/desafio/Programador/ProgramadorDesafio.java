package com.br.orientacaooo.desafio.Programador;

public class ProgramadorDesafio extends PessoaProgramador {

    private final String linguagem;

    public ProgramadorDesafio(String nome, int idade, String linguagem) {
        super(nome, idade);
        this.linguagem = linguagem;
    }

    @Override
    public String showInfo() {
        return getNome() + "\n" + getIdade() + "\n" + this.linguagem + "\n";
    }
}
