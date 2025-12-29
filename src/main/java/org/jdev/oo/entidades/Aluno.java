package org.jdev.oo.entidades;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private String nome;
    private int idade;
    private String dataNascimento;
    private String registroGeral;
    private String numeroCpf;
    private String nomeMae;
    private String nomePai;
    private String dataMatricula;
    private String nomeEscola;
    private String serieMatriculado;
    private List<Double> notas = new ArrayList<>();

    public Aluno() { /* É o construtor padrão do java, mesmo não deixando explícito */

    }

    public Aluno(String nome) { /* Construtor personalizado, caso não criemos o default só esse construtor ira funcionar */
        this.nome = nome;
    }

    public Aluno(String nome, int idade) {
        validaIdadeAluno(idade);
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        validaIdadeAluno(idade);
        this.idade = idade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRegistroGeral() {
        return registroGeral;
    }

    public void setRegistroGeral(String registroGeral) {
        this.registroGeral = registroGeral;
    }

    public String getNumeroCpf() {
        return numeroCpf;
    }

    public void setNumeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getSerieMatriculado() {
        return serieMatriculado;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }


    public void validaIdadeAluno(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("A idade do aluno deve ser maior que zero");
        }
    }

    public void adicionarNota(double nota) {
        if (nota < 0) {
            throw new IllegalArgumentException("A nota deve ser maior que zero");
        }
        notas.add(nota);
    }

    public String retornaAprovacaoAluno() {

        double totalNota = notas
                .stream()
                .mapToDouble(Double::doubleValue)
                .sum();

        return totalNota < 60 ? "Reprovado!" : "Aprovado!";
    }
}
