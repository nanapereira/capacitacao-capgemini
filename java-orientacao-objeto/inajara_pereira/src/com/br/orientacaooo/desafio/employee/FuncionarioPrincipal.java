package com.br.orientacaooo.desafio.employee;

import java.util.Locale;
import java.util.Scanner;

public class FuncionarioPrincipal {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        EmployeeDAO employeeDAO = new EmployeeDAO();

        System.out.println("Informe o número de funcioários: ");
        int nEmployees = sc.nextInt();

        for(int i= 0; i < nEmployees; i++ ){
            Employee employee = new Employee();

            System.out.println("Informe o id do funcionário: ");
            int id = sc.nextInt();
            employee.setId(id);

            System.out.println("Informe o nome do funcionário: ");
            String name =sc.next();
            employee.setName(name);
            sc.nextLine();

            System.out.println("Informe o salário do funcionário: ");
            double salary = sc.nextDouble();
            employee.setSalary(salary);
            employeeDAO.registryEmployes(employee);
        }

        employeeDAO.findAll();

        System.out.println("Informe id do funcionário para aumento de salário: ");
        int idAumento = sc.nextInt();

        System.out.println("Informe a porcentagem de aumento: ");
        double porcentagem = sc.nextDouble();
        employeeDAO.increaseSalary(idAumento, porcentagem);

        employeeDAO.findAll();
        sc.close();
    }
}
