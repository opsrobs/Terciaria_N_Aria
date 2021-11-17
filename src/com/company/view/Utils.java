package com.company.view;

import javax.swing.*;
import java.util.Date;

public class Utils {
    Date data = new Date();
    public Date Date(){
        return data;
    }
    public int cpf(){
        return Integer.parseInt("Informe o CPF: ");
    }
    public String nome(){
        return JOptionPane.showInputDialog("Informe o nome do Professor: ");
    }
    public int numSala(){
        return Integer.parseInt("Informe o numero da sala: ");
    }
    public String nomeSala(){
        return JOptionPane.showInputDialog("Informe o nome da Sala: ");
    }

    public int codTurma(){
        return Integer.parseInt("Informe o numero da sala: ");
    }
    public String nomeTurma(){
        return JOptionPane.showInputDialog("Informe o nome da Turma: ");
    }
}

