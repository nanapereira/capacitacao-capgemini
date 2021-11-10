package exercicio.resolvido.inajara_pereira;

import java.util.Locale;
import java.util.Scanner;

public class Ex08 {
    /*
    Algoritmo para gravar N valores reais.
    Imprimir todos os valores informados.
    Fazer a soma e media dos elementos do vetor.
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int tamanhoVetor = sc.nextInt();
        double[] vetorReal = new double[tamanhoVetor];


        for (int i = 0; i < tamanhoVetor; i++) {
            vetorReal[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print(vetorReal[i] + " ");
            soma += +vetorReal[i];
        }

        System.out.println();
        System.out.printf("Soma: %.2f%n", soma);

        double media = soma / tamanhoVetor;
        System.out.printf("Media: %.2f%n", media);
        sc.close();
    }
}
