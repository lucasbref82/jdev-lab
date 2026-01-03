package org.jdev.oo.principais;

import org.jdev.oo.entidades.Aluno;
import org.jdev.oo.entidades.Disciplina;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

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

        Aluno aluno = new Aluno();

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

        List<Disciplina> disciplinas = new ArrayList<>();

        String quantidadeDisciplinas = JOptionPane.showInputDialog("Digite a quantidade de disciplinas.");
        int n = Integer.parseInt(quantidadeDisciplinas);

        for (int i = 0; i < n; i++) {

            String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina.");

            List<Double> notas = new ArrayList<>();

            for (int j = 1; j <= 4; j++) {
                String nota = JOptionPane.showInputDialog("Digite a " + j + "º nota.");
                notas.add(Double.parseDouble(nota));
            }

            disciplinas.add(new Disciplina(nomeDisciplina, notas));
        }

        aluno.setDisciplinas(disciplinas);

        System.out.println(aluno);
        System.out.println("Média geral do aluno: " + aluno.calcularMediaGeral());
        System.out.println("Resultado final: " + aluno.situacaoFinalAluno());
    }
}
