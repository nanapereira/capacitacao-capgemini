package exercicio.resolvido.inajara_pereira;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        System.out.println("Digite a largura e comprimento com uma casa decimal: ");
        Scanner leitor = new Scanner(System.in);

        double largura = leitor.nextDouble();
        double comprimento = leitor.nextDouble();

        System.out.println("Digite o valor do metro quadrado do terreno com duas casas decimais: ");
        double valor = leitor.nextDouble();

        double area = largura*comprimento;
        double valorTerreno = area*valor;

        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PRECO = %.2f", valorTerreno);

        leitor.close();
    }
}
