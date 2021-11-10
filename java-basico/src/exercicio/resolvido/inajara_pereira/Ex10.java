package exercicio.resolvido.inajara_pereira;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        /*
        Algoritmo que leia dois valores x e y e criar uma matriz inteira
        com linha x e coluna y e imprimir os valores dos elementos.
         */

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int[][] valores = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                valores[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(valores[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
