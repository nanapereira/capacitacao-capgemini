package exercicio.resolvido.inajara_pereira.util.testeMesa;

import java.util.Arrays;

public class Ex04 {
    public static void main(String[] args) {
        int[][] mat = new int[3][3];
        int n = 3;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = 1 + i + j;
            }

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
