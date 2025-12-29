package org.jdev.oo.principais;

import org.jdev.oo.entidades.Aluno;

public class Main {

    /* Main é um metodo auto executável em java */
    public static void main(String[] args) {

        Aluno lucas = new Aluno();
        lucas.setNome("Lucas");
        lucas.setNomeEscola("Centro universitário UNA");
        lucas.adicionarNota(20);
        lucas.adicionarNota(15.5);
        lucas.adicionarNota(12);
        lucas.adicionarNota(21.9);

        System.out.printf("O aluno %s que estuda no %s foi: %s", lucas.getNome(), lucas.getNomeEscola() , lucas.retornaAprovacaoAluno());


        // NullPointerException
        Aluno larissa = null;

        Aluno pedro = new Aluno();

        Aluno olivia = new Aluno("Olívia");

        Aluno debora = new Aluno("Débora", 42);

    }

}
