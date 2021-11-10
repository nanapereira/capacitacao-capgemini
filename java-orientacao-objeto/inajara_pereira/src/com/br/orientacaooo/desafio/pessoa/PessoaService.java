package com.br.orientacaooo.desafio.pessoa;

import com.br.orientacaooo.desafio.pessoa.Pessoa;

public class PessoaService {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Carlos Silva");
        pessoa.setIdade(33);
        System.out.println(pessoa);
    }
}
