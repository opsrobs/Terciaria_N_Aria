package com.company.model;

import com.company.controller.Professor;
import com.company.controller.Sala;
import com.company.controller.Turma;

import java.util.Date;

public class Aula {
    private Date data;
    private Professor professor;
    private Sala sala;
    private Turma turma;

    public Aula(Date data, int cpf, String nome,int numSala, String nomesala, int codTurma, String nomeTruma) {
        this.data = data;
        professor = new Professor(cpf, nome);
        sala = new Sala(numSala,nomesala);
        turma = new Turma(codTurma,nomeTruma);
    }
}
