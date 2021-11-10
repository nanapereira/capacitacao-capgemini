package exercicio.resolvido.inajara_pereira.util;

import java.util.Locale;
import java.util.Scanner;

public class OperadoresCumulativos {
    /*
    Operadores Cumulativos

    a += 10 => 15 //Incrementar                         a = a + b
    a -= 10 => 15 //Decrementar                         a = a - b
    a *= 10 => 15 //Incrementar com multiplicação       a = a * b
    a /= 10 => 15 //Incrementar com divisão             a = a / b
    a %= 10 =. 15 //Incrementar com MOD                 a = a % b

     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int minutoUtilizados = scanner.nextInt();

        double franquia = 50.0;
        if (minutoUtilizados > 100) {
            franquia += (minutoUtilizados - 100) * 2.0;
        }

        System.out.printf("Valor final da conta R$ %.2f", franquia);

        scanner.close();
    }
}
