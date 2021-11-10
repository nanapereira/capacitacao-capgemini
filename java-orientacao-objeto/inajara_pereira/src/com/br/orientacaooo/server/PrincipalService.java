package com.br.orientacaooo.server;

import com.br.orientacaooo.model.entity.*;

public class PrincipalService {
    public static void main(String[] args) {

        Girafa girafo = new Girafa("João", "doberman", "caramelo", "macho", 30, true);
        girafo.setIdadeEmMeses(61);
        System.out.println(girafo.toString());

        Cachorro cachorro = new Cachorro("Fofinho", "golden", "dourado", "macho", true);
        cachorro.setIdadeEmMeses(25);
        System.out.println(cachorro.toString());

        Gato cat = new Gato("Kitty", "Sphynx", "preto", "femea", true);
        cat.setIdadeEmMeses(2);
        System.out.println(cat.toString());

        System.out.println(girafo.emitirSom());
        System.out.println(girafo.isAdulto());
        girafo.matarAnimal();
        System.out.println(girafo.emitirSom());
        System.out.println(girafo.isAdulto());
    }
}
