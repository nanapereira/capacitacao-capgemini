package exercicio.resolvido.inajara_pereira.util.testeMesa;

public class Ex09 {
    public static void main(String[] args) {
        int[][] mat = new int[2][4];
        int n = 4;
        for (int i=0; i<2; i++){
            for (int j = 0; j<i; j++){
                mat[i][j] = (i + 1) * 10;

            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
