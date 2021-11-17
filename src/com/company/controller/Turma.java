package com.company.controller;

public class Turma {
    private int codTurma;
    private String nome;

    public Turma(int codTurma, String nome) {
        this.codTurma = codTurma;
        this.nome = nome;
    }

    public Turma() {
    }

    public int getCodTurma() {
        return codTurma;
    }

    public void setCodTurma(int codTurma) {
        this.codTurma = codTurma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "codTurma=" + codTurma +
                ", nome='" + nome + '\'' +
                '}';
    }
}
