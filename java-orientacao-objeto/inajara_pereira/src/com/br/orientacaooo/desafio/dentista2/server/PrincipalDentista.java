package com.br.orientacaooo.desafio.dentista2.server;

import com.br.orientacaooo.desafio.dentista2.model.dao.ConsultaDAO;
import com.br.orientacaooo.desafio.dentista2.model.entity.Consulta;
import com.br.orientacaooo.desafio.dentista2.model.entity.Dentista;
import com.br.orientacaooo.desafio.dentista2.model.entity.Paciente;

import java.util.Date;
import java.util.Locale;

public class PrincipalDentista {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        //Criando um dentista e setando como Ativo;
        Dentista dentista = new Dentista();
        dentista.setNome("Aldo");
        dentista.setAtivo(true);

        //Criando um paciente com nome;
        Paciente paciente = new Paciente();
        paciente.setNome("Joaquim");

        //Instanciando a classe Consulta DAO
        ConsultaDAO consultas = new ConsultaDAO();

        //Chamando o método de marcar consulta - Insert
        //Faltou formatar a data
        consultas.marcarConsulta(1, new Date(), 150.00, paciente, dentista);
        consultas.marcarConsulta(2, new Date(), 150.00, paciente, dentista);
        consultas.marcarConsulta(3, new Date(), 115.00, paciente, dentista);
        consultas.marcarConsulta(4, new Date(), 200.00, paciente, dentista);
        consultas.findAll();

        //Chamdno o metódo remacarcar consulta - Update
        System.out.println("-----------------------------------------------------------");
        consultas.remarcarConsulta(4, new Date());

        //Chamndo método deletar consulta - delete
        System.out.println("-----------------------------------------------------------");
        consultas.cancelarConsulta(2);

        //Chamada método verifica todas as consultas - Select
        System.out.println("-----------------------------------------------------------");
        consultas.findAll();

        //Chamando método verificar apensa uma consulta - Select
        System.out.println("-----------------------------------------------------------");
        consultas.findById(3);

        //Chamando método para verificar se está ativo - isActive
        System.out.println("-----------------------------------------------------------");
        System.out.println(dentista.isAtivo());

        //Metódo para atender paciente - Iniciar consulta
        System.out.println("-----------------------------------------------------------");
        Consulta consulta = new Consulta(5, new Date(), 200.00, paciente, dentista);
        consulta.setStatus('I');
        consulta.setStatus('F');
        consultas.iniciarConsulta(consulta);

    }
}
