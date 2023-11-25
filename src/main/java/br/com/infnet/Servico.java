package br.com.infnet;

import lombok.Data;

import java.util.Date;

@Data
public class Servico {
    private double valor;
    private Date dataHoraCotacao;
    private Date dataHoraExecucao;
    private int avaliacao;

    public int avaliar(){
        return avaliacao;
    }

    public String informarObservacoes(String observacao){
        return observacao;
    }


}
