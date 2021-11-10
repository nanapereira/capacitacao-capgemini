package exercicio.resolvido.inajara_pereira;

import java.util.Locale;
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];
        int contadorIdade = 0;

        for (int i = 0; i < n; i++) {
            nomes[i] = sc.next();
            idades[i] = sc.nextInt();
            alturas[i] = sc.nextDouble();
            if (idades[i] < 16) {
                contadorIdade++;
            }
        }

        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += alturas[i];
        }

        double media = soma / n;
        System.out.printf("Média de altura %.2f%n", media);
        System.out.println("Pessoas com menos de 16 anos:" + contadorIdade * 100 / n + '%');

        sc.close();
    }
}
