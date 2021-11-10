package com.br.orientacaooo.desafio.employee2;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class PrincipalEmployee {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        ArrayList<Employee> employees = new ArrayList<>();

        System.out.print("Informe a quantidade de funcionários para cadastrar: ");
        int quantidade = scanner.nextInt();
        System.out.println();

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Informe o nome do funcionário: ");
            String name = scanner.next();
            scanner.nextLine();

            System.out.print("Informe a quantidade de horas trabalhadas: ");
            int hours = scanner.nextInt();

            System.out.print("Informe o valor por hora trabalhada: ");
            Double valuesPerHour = scanner.nextDouble();

            System.out.print("Se o funcionário é terceirizado digite (1): ");
            int resposta = scanner.nextInt();

            if (resposta == 1) {
                System.out.print("Informe o valor do bônus: ");
                Double bonus = scanner.nextDouble();
                OutsourceEmployee outsourcedEmployee = new OutsourceEmployee(name, hours, valuesPerHour, bonus);
                employees.add(outsourcedEmployee);
            } else {
                Employee employee = new Employee(name, hours, valuesPerHour);
                employees.add(employee);
            }
            System.out.println();
        }

        for (Employee employee: employees) {
            System.out.println(employee);
        }
        scanner.close();
    }
}
