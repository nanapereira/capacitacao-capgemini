package com.br.orientacaooo.desafio.Programador;

import java.util.Scanner;

public class ProgramadorService {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        int idade = sc.nextInt();
        sc.nextLine();
        String linguagem = sc.next();


        ProgramadorDesafio programador = new ProgramadorDesafio(nome, idade, linguagem);
        System.out.println(programador.showInfo());

    }
}
