package com.br.orientacaooo.estruturadados;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {

        LinkedList<String> cars = new LinkedList<>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        System.out.println(cars);

        cars.addFirst("Mazda");
        cars.addLast("Bugatti");
        System.out.println(cars);
        System.out.println(cars.get(1));

        cars.removeFirst();
        System.out.println(cars);

    }
}
