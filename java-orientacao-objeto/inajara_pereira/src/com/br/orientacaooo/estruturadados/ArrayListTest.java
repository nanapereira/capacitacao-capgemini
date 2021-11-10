package com.br.orientacaooo.estruturadados;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<String> alunos = new ArrayList<>();
        int confirm;

        do {
            alunos.add(JOptionPane.showInputDialog("Informe o nome do aluno:"));
            confirm = JOptionPane.showConfirmDialog(null, "Continuar?");
        } while (confirm == 0);

        System.out.println(alunos);

        alunos.remove("Diego");
        System.out.println(alunos);

//        alunos.set(2, "Madalena");
        System.out.println(alunos);

        for (int i = 0; i < alunos.size(); i++) {
            if (Objects.equals(alunos.get(i), "Mia")) {
                alunos.set(i, "Pedro");
            }
        }
        System.out.println(alunos);


        if(alunos.contains("Roberta")){
            alunos.set(alunos.indexOf("Roberta"), "Manuela");
        }else{
            System.out.println("Não achei a Roberta!");
        }
        System.out.println(alunos);

       Collections.sort(alunos);
        System.out.println(alunos);

        Collections.reverse(alunos);
        System.out.println(alunos);

        alunos.clear();

        if(alunos.isEmpty()){
            System.out.println("Array Vazio!");
        }

        alunos.add("Teste");
        System.out.println(alunos);


    }
}
