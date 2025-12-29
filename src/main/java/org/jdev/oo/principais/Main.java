package org.jdev.oo.principais;

import org.jdev.oo.entidades.Aluno;

public class Main {

    /* Main é um metodo auto executável em java */
    public static void main(String[] args) {

        Aluno lucas = new Aluno();
        lucas.nome = "Lucas";
        System.out.printf("Nome do aluno um é %s.", lucas.nome);

        // NullPointerException
        Aluno larissa = null;

        System.out.printf("O nome do aluno dois é %s.", larissa.nome);

        Aluno pedro = new Aluno();

        Aluno olivia = new Aluno("Olívia");

        Aluno debora = new Aluno("Débora", 42);

    }

}
