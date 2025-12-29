package org.jdev.oo.principais;

import org.jdev.oo.entidades.Aluno;

import javax.swing.*;

public class Main {

    /* Main é um metodo auto executável em java */
    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        String nome = JOptionPane.showInputDialog("Qual é o nome do aluno?");
        String idade = JOptionPane.showInputDialog("Qual a idade ?");
        String dataNascimento = JOptionPane.showInputDialog("Qual é a data de nascimento?");
        String rg = JOptionPane.showInputDialog("Qual é o RG?");
        String cpf = JOptionPane.showInputDialog("Qual é o cpf do aluno?");
        String mae = JOptionPane.showInputDialog("Qual é o nome da mãe?");
        String pai = JOptionPane.showInputDialog("Qual é o nome do pai?");
        String dataMatricula = JOptionPane.showInputDialog("Qual é a data da matricula?");
        String nomeEscola = JOptionPane.showInputDialog("Qual é o nome da escola?");
        String serieMatriculado = JOptionPane.showInputDialog("Qual é a série que o matriculado está?");

        aluno.setNome(nome);
        aluno.setIdade(Integer.parseInt(idade));
        aluno.setDataNascimento(dataNascimento);
        aluno.setRegistroGeral(rg);
        aluno.setNumeroCpf(cpf);
        aluno.setNomeMae(mae);
        aluno.setNomePai(pai);
        aluno.setDataMatricula(dataMatricula);
        aluno.setNomeEscola(nomeEscola);
        aluno.setSerieMatriculado(serieMatriculado);

    }
}
