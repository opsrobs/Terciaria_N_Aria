package com.company.controller;

public class Sala {
    private int numSala;
    private String nome;

    public Sala(int numSala, String nome) {
        this.numSala = numSala;
        this.nome = nome;
    }

    public Sala() {
    }

    public int getNumSala() {
        return numSala;
    }

    public void setNumSala(int numSala) {
        this.numSala = numSala;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "numSala=" + numSala +
                ", nome=" + nome +
                '}';
    }
}
