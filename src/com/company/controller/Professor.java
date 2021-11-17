package com.company.controller;

public class Professor {
    private int CPF;
    private String nome;

    public Professor(int CPF, String nome) {
        this.CPF = CPF;
        this.nome = nome;
    }

    public Professor() {
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "CPF=" + CPF +
                ", nome='" + nome + '\'' +
                '}';
    }
}
