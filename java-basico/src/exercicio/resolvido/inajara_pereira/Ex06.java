package exercicio.resolvido.inajara_pereira;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamanhoVetor = sc.nextInt();

        int[] listaNumeros = new int[tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i++) {
            listaNumeros[i] = sc.nextInt();
        }

        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.println(listaNumeros[i]);
        }

        sc.close();
    }
}
