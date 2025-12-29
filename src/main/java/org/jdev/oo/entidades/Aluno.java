package org.jdev.oo.entidades;

public class Aluno {

    public String nome;
    public int idade;
    public String dataNascimento;
    public String registroGeral;
    public String numeroCpf;
    public String nomeMae;
    public String nomePai;
    public String dataMatricula;
    public String nomeEscola;
    public String serieMatriculado;

    public Aluno() { /* É o construtor padrão do java, mesmo não deixando explícito */

    }


    public Aluno(String nome) { /* Construtor personalizado, caso não criemos o default só esse construtor ira funcionar */
        this.nome = nome;
    }

    public Aluno(String nome, int idade) {
        validaIdadeAluno(nome, idade);
        this.nome = nome;
        this.idade = idade;
    }

    public void validaIdadeAluno(String nome, int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("A idade do aluno: " + nome + "deve ser maior que zero");
        }
    }
}
