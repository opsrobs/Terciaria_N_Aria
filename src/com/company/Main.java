package com.company;

import com.company.model.Aula;
import com.company.view.Utils;

import javax.swing.plaf.basic.BasicGraphicsUtils;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Aula aula;
        Utils utils = new Utils();
        System.out.println(utils.Date());
        String nome = utils.nome();
        int cpf;
        int numSala;
        String nomeSala;
        int codTurma;
        String nomeTurma;


        while (!nome.equals("sair")) {
            Date data = new Date();
            cpf = utils.cpf();
            numSala = utils.numSala();
            nomeSala = utils.nomeSala();
            codTurma = utils.codTurma();
            nomeTurma = utils.nomeTurma();

            aula = new Aula(data, cpf, nome, numSala, nomeSala, codTurma, nomeTurma);
            nome = utils.nome();
        }
    }
}
