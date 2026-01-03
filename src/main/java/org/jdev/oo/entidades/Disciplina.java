package org.jdev.oo.entidades;

import java.util.List;

public class Disciplina {

    private String nome;

    private List<Double> notas;

    public Disciplina() {
    }

    public Disciplina(String nome, List<Double> notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void adicionarNota(List<Double> notas) {
        if (notas.isEmpty()){
            throw new IllegalArgumentException("A notas não podem ser vazias");
        }
        this.notas.addAll(notas);
    }

    public void adicionarNota(double nota) {
        if (nota < 0) {
            throw new IllegalArgumentException("A nota deve ser maior que zero");
        }
        notas.add(nota);
    }
    public double recuperaMedia() {
        return notas
                .stream()
                .mapToDouble(Double::doubleValue)
                .sum() / notas.size();

    }


}
