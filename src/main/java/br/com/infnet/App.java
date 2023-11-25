package br.com.infnet;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args ) {
        Agenda minhaAgenda = new Agenda();

        minhaAgenda.adicionarDiasDeTrabalho("21/10");
        minhaAgenda.adicionarDiasDeTrabalho("13/12");
        minhaAgenda.adicionarDiasDeTrabalho("05/01");

        minhaAgenda.verificarDiasDeTrabalho();
    }
}
