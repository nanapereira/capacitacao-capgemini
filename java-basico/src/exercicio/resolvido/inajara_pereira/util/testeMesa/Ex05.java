package exercicio.resolvido.inajara_pereira.util.testeMesa;

import java.util.Arrays;

public class Ex05 {
    public static void main(String[] args) {
        int[][] mat = new int[2][4];
        int m = 2;
        int n = 4;
        int x = 0;

        for (int i =0; i < m; i++){
            x = x + i;
            for (int j = 0; j < n; j++){
                x = x + j;
               mat[i][j] = x;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
