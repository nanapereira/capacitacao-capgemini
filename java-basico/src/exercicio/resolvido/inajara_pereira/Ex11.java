package exercicio.resolvido.inajara_pereira;

import java.util.Scanner;

public class Ex11 {
    /*
    Criar uma matriz quadrada.
     Apresentas os valores da diagonal principal.
     Apresentar os elementos negativos da matriz.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] valores = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                valores[i][j] = sc.nextInt();
            }
        }

        System.out.println("Elementos da diagonal principal: ");
        for (int i = 0; i < n; i++) {
            System.out.println(valores[i][i] + " ");
        }

        int qtdNumeroNegativos = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (valores[i][j] < 0) {
                    qtdNumeroNegativos++;
                }
            }
        }

        System.out.printf("Numero de elementos negativos: %d %n", qtdNumeroNegativos);
        sc.close();
    }
}
