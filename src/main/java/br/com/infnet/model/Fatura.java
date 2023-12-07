package br.com.infnet.model;

import lombok.Data;

import java.util.Date;

@Data
public class Fatura {
    private float valor;
    private Date dataEmissao;
    private Date dataVencimento;
    private float valorPago;
    private Servico servico;

    public void atualizarPagamentoParcial(float valor){

    }
}
