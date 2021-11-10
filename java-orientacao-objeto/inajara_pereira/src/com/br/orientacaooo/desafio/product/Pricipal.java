package com.br.orientacaooo.desafio.product;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Pricipal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        ArrayList<Product> products = new ArrayList<>();

        System.out.print("Informe a quantidade de produtos: ");
        int quantidade = scanner.nextInt();
        System.out.println();

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Se o produto é importado digite (i) e se Usado digite (u): ");
            String category = scanner.next();
            scanner.nextLine();

            if (category.equals("i")) {
                System.out.print("Informe o nome do nome do produto: ");
                String name = scanner.next();
                scanner.nextLine();

                System.out.print("Informe o valor do produto: ");
                Double price = scanner.nextDouble();

                System.out.print("Informe a taxa de alfândega: ");
                Double customFee = scanner.nextDouble();

                ImportedProduct importedProduct = new ImportedProduct(name, price, customFee);
                products.add(importedProduct);
                System.out.println();
            } else if (category.equals("u")) {
                System.out.print("Informe o nome do nome do produto: ");
                String name = scanner.next();
                scanner.nextLine();

                System.out.print("Informe o valor do produto: ");
                Double price = scanner.nextDouble();

                System.out.print("Informe a data de fabricação: ");
                String manufactureDate = scanner.next();

                UsedProduct usedProduct = new UsedProduct(name, price, manufactureDate);
                products.add(usedProduct);
                System.out.println();
            } else {
                System.out.println("Este produto não está categorizado!");
                System.out.println();
            }
        }

        for (Product product : products) {
            System.out.println(product.priceTag());
        }
    }
}
