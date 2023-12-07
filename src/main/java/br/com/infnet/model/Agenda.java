package br.com.infnet.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Agenda {
    private List<Integer> diasDeTrabalho;

    public List<Date> verificarDatasDisponiveis(){

    }

    public Boolean verificarSeDataEstaDisponivel(Date data){

    }

    public List<Date> visualizarCompromissos(Date inicioDoPeriodo, Date fimDoPeriodo){

    }

    public Funcionario visualizarFuncionario(){

    }

    public List<Funcionario> visualizarFuncionarios(){

    }
}

