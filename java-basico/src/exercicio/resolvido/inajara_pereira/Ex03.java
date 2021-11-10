package exercicio.resolvido.inajara_pereira;

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media < 6.0) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Aprovado");
        }
        sc.close();
    }
}
