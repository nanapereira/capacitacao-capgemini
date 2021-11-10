package br.com.zoo.model.entity;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Animal {

    private int codigo;
    private String nome;
    private String especie;
    private String sexo;
    private String caracteristica;
    private String dataCadastro;
    private String dataNascimento;
    private int codigoDono;

    public Animal() {
    }

    public Animal(int codigo, String nome, String especie, String sexo, String caracteristica,
                  String dataCadastro, String dataNascimento, int codigoDono) {
        this.codigo = codigo;
        this.nome = nome;
        this.especie = especie;
        this.sexo = sexo;
        this.caracteristica = caracteristica;
        this.dataCadastro = dataCadastro;
        this.dataNascimento = dataNascimento;
        this.codigoDono = codigoDono;
    }

    public Animal(String nome, String especie, String sexo, String caracteristica, String dataCadastro,
                  String dataNascimento, int codigoDono) {
        this.nome = nome;
        this.especie = especie;
        this.sexo = sexo;
        this.caracteristica = caracteristica;
        this.dataCadastro = dataCadastro;
        this.dataNascimento = dataNascimento;
        this.codigoDono = codigoDono;
    }

    public Animal(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Animal(String nome, String especie, String sexo, String caracteristica, String dataCadastro,
                  String dataNascimento) {
        this.nome = nome;
        this.especie = especie;
        this.sexo = sexo;
        this.caracteristica = caracteristica;
        this.dataCadastro = dataCadastro;
        this.dataNascimento = dataNascimento;
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

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getCodigoDono() {
        return codigoDono;
    }

    public void setCodigoDono(int codigoDono) {
        this.codigoDono = codigoDono;
    }

    @Override
    public String toString() {
        return "\nAnimal{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", especie='" + especie + '\'' +
                ", sexo='" + sexo + '\'' +
                ", caracteristica='" + caracteristica + '\'' +
                ", dataCadastro='" + dataCadastro + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", codigoDono=" + codigoDono +
                '}';
    }

    public String calculaIdade(String dataNascimento) throws ParseException {
        DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar dataNascimentoGregorian = new GregorianCalendar();
        dataNascimentoGregorian.setTime(sdf.parse(dataNascimento));
        int anos = Calendar.getInstance().get(Calendar.YEAR) - dataNascimentoGregorian.get(Calendar.YEAR);
        int meses = Calendar.getInstance().get(Calendar.MONTH) - dataNascimentoGregorian.get(Calendar.MONTH);
        if(meses == 0){
            return + anos + " ano(s)";
        }else{
            return + anos + " ano(s) e "+ meses + " mes(es)";
        }
    }
}
