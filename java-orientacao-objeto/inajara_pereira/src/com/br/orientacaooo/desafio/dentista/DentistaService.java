package com.br.orientacaooo.desafio.dentista;

public class DentistaService {

    public static void main(String[] args) {
        Paciente paciente = new Paciente();
        paciente.setNome("Mateus");
        paciente.setIdade(19);

        Dentista dentista = new Dentista();
        dentista.atenderPaciente(paciente);
        boolean situacao = dentista.verifierDispositive("João");


        PessoaDentista pessoa = new PessoaDentista();
        pessoa.marcarConsulta(dentista, paciente);

        paciente.cancelarConsulta(100, dentista, paciente);
        paciente.remarcarConsulta(dentista, paciente, 100);
        paciente.verificarConsulta(100);

    }
}
