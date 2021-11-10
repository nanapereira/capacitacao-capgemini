package com.br.orientacaooo.desafio.dentista;

public class PessoaDentista {

    private int codigo;
    private String nome;
    private String sobrenome;
    private int idade;
    private char sexo;
    private String telefone;
    private String endereco;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void marcarConsulta(Dentista dentista, Paciente paciente) {
        if (paciente.getIdade() > 18) {
            System.out.println("Consulta marcada!");
        }
    }

    public void remarcarConsulta(Dentista dentista, Paciente paciente, int codigo) {
        if (codigo > 0) {
            System.out.println("Consulta remarcada!");
            this.codigo = codigo;
        }
    }

    public void verificarConsulta(int codigo) {
        this.codigo = codigo;
    }

}
