package com.br.orientacaooo.desafio.area;

import java.util.Locale;

public class CirculoService {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Circulo areaDoCirculo = new Circulo();
        areaDoCirculo.setRaio(15);
        System.out.printf("Implementei: Forma%n%.2f", areaDoCirculo.area());
    }
}
