package br.com.zoo.model.entity;

public class Dono {

    private int codigo;
    private String nome;
    private String telefone;

    public Dono() {
    }

    public Dono(int codigo, String nome, String telefone) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
    }

    public Dono(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public Dono(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "\nDono{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}