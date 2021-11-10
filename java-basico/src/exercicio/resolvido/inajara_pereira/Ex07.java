package exercicio.resolvido.inajara_pereira;

import java.util.Scanner;

public class Ex07 {

    /*
    Algoritmo que le N numeros inteiro e armazenar em vetor
    mostrar os valores negativos;
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamanhoVetor = sc.nextInt();
        int[] listaNumeros = new int[tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i++) {
            listaNumeros[i] = sc.nextInt();
        }

        for (int i = 0; i < tamanhoVetor; i++) {
            if (listaNumeros[i] < 0) {
                System.out.println(listaNumeros[i] + ",");
            }
        }

        sc.close();
    }

}
