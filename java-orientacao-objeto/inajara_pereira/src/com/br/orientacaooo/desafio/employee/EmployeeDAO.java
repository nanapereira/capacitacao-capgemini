package com.br.orientacaooo.desafio.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

    List<Employee> employees = new ArrayList<>();

    public boolean hasId(int id) {
        Employee employee = this.employees.stream().filter(em -> em.getId() == id).findFirst().orElse(null);
        return employee == null;
    }

    public void registryEmployes(Employee employee) {
        if (hasId(employee.getId())) {
            this.employees.add(employee);
        }
    }

    public void increaseSalary(int id, double porcentagem){
        if (hasId(id)) {
            Employee employee = this.employees.stream().filter(em -> em.getId() == id).findFirst().orElse(null);
            assert employee != null;
            employee.setSalary(employee.getSalary() * porcentagem / 100);
        }else{
        System.out.println("O id informado não existe!");
        }
    }

    public void findAll() {
        for (Employee employee : this.employees) {
            System.out.println(
                    "{Id: " + employee.getId() +
                            ", Name: " + employee.getName() +
                            ", Salary: " + employee.getSalary() +
                            "}"
            );
        }
    }

}
