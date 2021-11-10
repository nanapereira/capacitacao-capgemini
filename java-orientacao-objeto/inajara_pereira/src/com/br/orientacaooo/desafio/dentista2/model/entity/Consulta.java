package com.br.orientacaooo.desafio.dentista2.model.entity;

import java.util.Date;

public class Consulta {

    private int codigo;
    private Date data;
    private double valor;
    private Paciente paciente;
    private Dentista dentista;
    private char status;

    public Consulta(int codigo, Date data, double valor, Paciente paciente, Dentista dentista) {
        this.codigo = codigo;
        this.data = data;
        this.valor = valor;
        this.paciente = paciente;
        this.dentista = dentista;
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Dentista getDentista() {
        return dentista;
    }

    public void setDentista(Dentista dentista) {
        this.dentista = dentista;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }
}
