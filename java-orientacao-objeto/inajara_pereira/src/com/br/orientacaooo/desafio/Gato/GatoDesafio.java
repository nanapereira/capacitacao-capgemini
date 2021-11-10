package com.br.orientacaooo.desafio.Gato;

public class GatoDesafio extends AnimalDesafio {

    @Override
    public String getEspecie() {
        return getNomeAnimal() + " é um gato";
    }
}
