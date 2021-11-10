package exercicio.resolvido.inajara_pereira.util.testeMesa;

public class Ex07 {
    public static void main(String[] args) {
        int[][] mat = new int[3][3];
        int[] v = new int[3];
        int n = 3;

        for (int i = 0; i<n; i++){
            int x = 0;
            for (int j=0; j<n; j++){
                mat[i][j] = i + j;
                x = x + mat[i][j];
            }
            v[i] = x;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        for (int i =0; i< n; i++){
            System.out.println(v[i]);
        }

    }
}
