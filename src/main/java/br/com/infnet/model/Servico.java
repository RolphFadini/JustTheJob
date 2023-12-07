package br.com.infnet.model;

import br.com.infnet.model.Gerente;
import br.com.infnet.model.Imovel;
import lombok.Data;

import java.util.Date;

@Data
public class Servico {
    private Imovel imovel;
    private Gerente gerente;
    private Date dataHoraCotacao;
    private float valor;
    private Date dataHoraExecucao;
    private List<Faxineiro> equipe;
    private boolean avaliacao;

    public void marcarVisitaParaCotacao(Date data, Imovel imovel, Gerente gerente){

    }

    public void marcarRealizacaoDoServico(Date data){

    }

    public void adicionarMembroAEquipe(Faxineiro faxineiro){

    }

    public void avaliarServico(int nota){

    }
}
