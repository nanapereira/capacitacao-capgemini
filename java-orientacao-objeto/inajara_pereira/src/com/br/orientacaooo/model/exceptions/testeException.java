package com.br.orientacaooo.model.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class testeException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Tratamento de exceção abstrato
        try {
            String[] vetor = sc.nextLine().split(" ");
            int posicao = sc.nextInt();
            System.out.println(vetor[posicao]);
        } catch (Exception e) {
            System.out.println("Pode ser qualquer coisa!");
        }

        //Tratamento de exceção específica
        try {
            String[] vetor = sc.nextLine().split(" ");
            int posicao = sc.nextInt();
            System.out.println(vetor[posicao]);
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("Posição inválida!");
        } catch (InputMismatchException ie) {
            System.out.println("Erro de entrada de dados!");
        }

        // Tratamento de exceção agrupada
        try {
            String[] vetor = sc.nextLine().split(" ");
            int posicao = sc.nextInt();
            System.out.println(vetor[posicao]);
        } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
            System.out.println("Posição inválida ou Erro de entrada de dados!");
        }

        System.out.println("Fim do programa!");
        sc.close();
    }
}
