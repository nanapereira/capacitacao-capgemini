package com.br.orientacaooo.desafio.dentista2.model.dao;

import com.br.orientacaooo.desafio.dentista2.model.entity.Consulta;
import com.br.orientacaooo.desafio.dentista2.model.entity.Dentista;
import com.br.orientacaooo.desafio.dentista2.model.entity.Paciente;

import java.util.ArrayList;
import java.util.Date;

public class ConsultaDAO {

    ArrayList<Consulta> consultas = new ArrayList<Consulta>();

    public void marcarConsulta(int codigo, Date data, double valor, Paciente paciente, Dentista dentista) {
        consultas.add(new Consulta(codigo, data, valor, paciente, dentista));
    }

    public void findById(int codigo) {
        for (Consulta consulta : this.consultas) {
            if (consulta.getCodigo() == codigo) {
                System.out.println(
                        "{Código: " + consulta.getCodigo() +
                                ", Data: " + consulta.getData() +
                                ", Valor: " + consulta.getValor() +
                                ", Paciente: " + consulta.getPaciente().getNome() +
                                ", Dentista: " + consulta.getDentista().getNome() +
                                "}"
                );
                break;
            }
        }
    }

    public void findAll() {
        for (Consulta consulta : this.consultas) {
            System.out.println(
                    "{Código: " + consulta.getCodigo() +
                            ", Data: " + consulta.getData() +
                            ", Valor: " + consulta.getValor() +
                            ", Paciente: " + consulta.getPaciente().getNome() +
                            ", Dentista: " + consulta.getDentista().getNome() +
                            "}"
            );
        }
    }

    public void iniciarConsulta(Consulta consulta) {
        if(consulta.getStatus() == 'I'){
            System.out.println("Consulta Iniciada!");
        } else if(consulta.getStatus() == 'F'){
            System.out.println("Consulta Finalizada!");
        }else {
            System.out.println("Status indefinido!");
        }
    }

    public void remarcarConsulta(int codigo, Date data) {
        for (Consulta consulta : this.consultas) {
            if (consulta.getCodigo() == codigo) {
                consulta.setData(data);
                break;
            }
        }
    }

    public void cancelarConsulta(int codigo) {
        for (Consulta consulta : this.consultas) {
            if (consulta.getCodigo() == codigo) {
                this.consultas.remove(consulta);
                break;
            }
        }
    }
}
