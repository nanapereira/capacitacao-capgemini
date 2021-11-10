package exercicio.resolvido.inajara_pereira.util;

import java.util.Scanner;

public class EscolhaCasoFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dia = sc.nextInt();
        String diaSemana;

        switch (dia) {
            case 1:
                diaSemana = "Domingo";
                break;
            case 2:
                diaSemana = "Segunda";
                break;
            case 3:
                diaSemana = "Terça";
                break;
            case 4:
                diaSemana = "Quarta";
                break;
            case 5:
                diaSemana = "Quinta";
                break;
            case 6:
                diaSemana = "Sexta";
                break;
            default:
                diaSemana = "dia inválido!";
        }

        System.out.println("Hoje é " + diaSemana);
        sc.close();
    }
}
