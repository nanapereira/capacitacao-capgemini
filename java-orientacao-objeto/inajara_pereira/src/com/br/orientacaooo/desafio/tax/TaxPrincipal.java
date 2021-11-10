package com.br.orientacaooo.desafio.tax;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class TaxPrincipal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> taxPayerList = new ArrayList<>();

        System.out.print("Quantos contribuintes deseja cadastar: ");
        int n = sc.nextInt();

        System.out.println();
        for (int i = 1; i <= n; i++) {
            System.out.print("Informe o nome do contribuinte: ");
            String name = sc.next();
            sc.nextLine();

            System.out.print("Informe a renda anual: ");
            Double anualIncome = sc.nextDouble();

            System.out.print("Pessoa fisica (1) ou juridica (2)? ");
            int resposta = sc.nextInt();

            if (resposta == 1) {
                System.out.print("Houve dispesa médica? sim(1) ou não(2) ");
                int resp = sc.nextInt();

                if (resp == 1) {
                    System.out.print("Informe o valor: ");
                    Double healthExpenditures = sc.nextDouble();
                    Individual taxPayer = new Individual(name, anualIncome, healthExpenditures);
                    taxPayerList.add(taxPayer);
                } else {
                    Individual taxPayer = new Individual(name, anualIncome);
                    taxPayerList.add(taxPayer);
                }

                System.out.println();
            } else if (resposta == 2) {
                System.out.print("Quantos funcinários a empresa possui: ");
                int numberOfEmployees = sc.nextInt();
                Company taxPayer = new Company(name, anualIncome, numberOfEmployees);
                taxPayerList.add(taxPayer);
                System.out.println();
            }
        }
        for (TaxPayer taxPayer : taxPayerList) {
            System.out.println(taxPayer);
        }
        sc.close();
    }
}
