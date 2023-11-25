package br.com.infnet;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Agenda {
    private List<String> diasDeTrabalho;

    public Agenda() {
        this.diasDeTrabalho = new ArrayList<>();
    }

    public void adicionarDiasDeTrabalho(String data) {
        this.diasDeTrabalho.add(data);
    }

    public void verificarDiasDeTrabalho() {
        for (String dia : diasDeTrabalho) {
            System.out.println(dia);
        }
    }
}

