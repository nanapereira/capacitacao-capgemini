package com.br.orientacaooo.desafio.livro;

public class LivroService {
    public static void main(String[] args) {
        String nome = "Senhor dos anéis";

        MeuLivro livro = new MeuLivro();
        livro.setNome(nome);

        System.out.println(livro.toString());
    }
}
