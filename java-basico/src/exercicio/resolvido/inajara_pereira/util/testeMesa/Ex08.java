package exercicio.resolvido.inajara_pereira.util.testeMesa;

public class Ex08 {
    public static void main(String[] args) {
        int m = 5;
        double[][] mat = new double[m][m];
        double[] v = new double[m];

        for (int i = 0; i<m; i++) {
            v[i] = 10 - i;
        }
         for (int i=0; i<m; i++){
                mat[i][i] = v[i] / 10;
            }


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        for (int i =0; i< m; i++){
            System.out.println(v[i]);
        }

    }
}
