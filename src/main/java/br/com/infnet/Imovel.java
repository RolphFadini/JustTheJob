package br.com.infnet;

import lombok.Data;

@Data
public class Imovel {
    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private int cep;
}
