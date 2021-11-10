package exercicio.resolvido.inajara_pereira;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if (n1 < n2 && n1 < n3) {
            System.out.println(n1);
        } else System.out.println(Math.min(n2, n3));
        sc.close();
    }
}
