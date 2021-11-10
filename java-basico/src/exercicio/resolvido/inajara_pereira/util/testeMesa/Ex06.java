package exercicio.resolvido.inajara_pereira.util.testeMesa;

public class Ex06 {
    public static void main(String[] args) {
        int[][] mat = new int[5][5];
        int m = 5;
        for (int i =0; i<m; i++){
            mat[3][i] = 10;
        }

        for(int i =0; i<m; i++){
            mat[i][4] = 10 * i;
            mat[i][i] = 50;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }


    }
}
