package com.br.orientacaooo.desafio.dentista;

public class Dentista extends PessoaDentista {

    private String especialidade;
    private String registro;
    private boolean ativo = false;

    public void atenderPaciente(Paciente paciente) {
        if (paciente.getNome() != null) {
            System.out.printf("O Paciente %S pode entrar no consultorio!\n", paciente.getNome());
        }
    }

    public boolean verifierDispositive(String nome) {
        if (nome != null) {
            this.ativo = true;
            System.out.printf("O dentista %S está ativo!\n", nome);
        }
        return this.ativo;
    }
}
