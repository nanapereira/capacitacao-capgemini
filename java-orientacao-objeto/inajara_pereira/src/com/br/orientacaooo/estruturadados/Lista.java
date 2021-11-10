package com.br.orientacaooo.estruturadados;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

    public static void main(String[] args) {

        //------------------------------------------------------------//
        System.out.println("-------Imprimindo a lista de nomes--------");
        List<String> listaNomes = new ArrayList<>();
        listaNomes.add("Maria");
        listaNomes.add("João");
        listaNomes.add("José");
        listaNomes.add("Pedro");
        listaNomes.add("Thiago");
        listaNomes.add("Ana");
        listaNomes.add("Camila");
        listaNomes.add("Eduardo");

        System.out.println("Tamanho da lista: " + listaNomes.size());
        for (String nome : listaNomes) {
            System.out.println(nome);
        }

        //------------------------------------------------------------//
        System.out.println("--------Adicionando outro elemento no index-------");
        listaNomes.add(1, "Naná");
        System.out.println("Tamanho da lista: " + listaNomes.size());
        for (String nome : listaNomes) {
            System.out.println(nome);
        }

        //------------------------------------------------------------//
        System.out.println("--------Removendo elemento pelo index ou pelo tipo--");
        listaNomes.remove("José");
        listaNomes.remove(2);

        System.out.println("Tamanho da lista: " + listaNomes.size());
        for (String nome : listaNomes) {
            System.out.println(nome);
        }

        //------------------------------------------------------------//
        System.out.println("--------Pegando elemento pelo index ou pelo tipo--");
        System.out.println(listaNomes.get(0));
        System.out.println(listaNomes.indexOf("Maria"));

        //------------------------------------------------------------//
        System.out.println("--------Removendo elemento com Lambda-------");
        System.out.println(listaNomes.removeIf(nome -> nome.equals("Maria")));
        System.out.println(listaNomes.removeIf(nome -> nome.charAt(0) == 'A'));

        System.out.println("Tamanho da lista: " + listaNomes.size());
        for (String nome : listaNomes) {
            System.out.println(nome);
        }

        //------------------------------------------------------------//
        System.out.println("--------Filtrando com lambda e gerando nova lista-------");
        List<String> resultado = listaNomes.stream().filter(nome -> nome.charAt(0) == 'C').collect(Collectors.toList());

        System.out.println("Tamanho da lista nomes: " + listaNomes.size());
        System.out.println("Tamanho da lista resultado: " + resultado.size());
        for (String nome : resultado) {
            System.out.println(nome);
        }

    }

}
