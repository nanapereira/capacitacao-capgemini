package com.br.orientacaooo.desafio.account;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        ArrayList<Account> accounts = new ArrayList<>();
        int opcao;

        do {
            System.out.print("Digite (0) sair, (1) cadastrar, (2) depositar, (3) sacar: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1 -> {
                    cadastrar(scanner, accounts);
                }
                case 2 -> {
                    depositar(scanner, accounts);
                }
                case 3 -> {
                    sacar(scanner, accounts);
                }
                default -> System.out.println("Finalizado!");
            }
        } while (opcao != 0);

        System.out.println(accounts);
    }


    private static void sacar(Scanner sc, ArrayList<Account> accounts) {
        System.out.print("Informe o número da sua conta: ");
        int numberAccount2 = sc.nextInt();
        for (Account account1 : accounts) {
            if (account1.getNumber() == numberAccount2) {
                System.out.println("Informe o valor do saque: ");
                Double valorSaque = sc.nextDouble();
                account1.withdraw(valorSaque);
                System.out.println(account1);
            } else {
                System.out.println("Conta inexistente!");
            }
        }
    }

    private static void depositar(Scanner sc, ArrayList<Account> accounts) {
        System.out.print("Informe o número da sua conta: ");
        int numberAccount = sc.nextInt();
        for (Account account1 : accounts) {
            if (account1.getNumber() == numberAccount) {
                System.out.print("Informe o valor do depósito: ");
                Double valorDeposito = sc.nextDouble();
                account1.deposite(valorDeposito);
                System.out.println(account1);
            } else {
                System.out.println("Conta inexistente!");
            }
        }
    }

    private static void cadastrar(Scanner sc, ArrayList<Account> accounts) {
        System.out.println("Iniciando cadastro da conta...");
        System.out.print("Numero da conta: ");
        Integer number = sc.nextInt();
        System.out.print("Nome do títular: ");
        String holder = sc.next();
        sc.nextLine();
        Account account = new Account(number, holder);
        System.out.print("Você deseja informar valor inicial? (s)sim (n) não: ");
        String resposta = sc.next();
        sc.nextLine();
        if (resposta.equals("s")) {
            System.out.print("Informe o valor do depósito: ");
            Double balance = sc.nextDouble();
            account.deposite(balance);
        } else {
            System.out.println("Sem valor inicial adicionado!");
        }
        accounts.add(account);
        System.out.println(account);
    }
}


