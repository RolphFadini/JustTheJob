package br.com.infnet.model;

import lombok.Data;

import java.util.List;

@Data
public class Imovel {
    private Cliente cliente;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private int cep;

    public Imovel visualizarDadosDoImovel(){

    }

    public Cliente visualizarDadosDoProprietario(){

    }

    public List<Servico> visualizarHistoricoServicos(){

    }
}
