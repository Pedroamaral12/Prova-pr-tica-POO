package Evento.Participantes;
import Evento.Participantes.Participantes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListaParticipantes {
    static ArrayList <Participantes> listaParticipantes;
    static ArrayList<String> arrayNames;
    public ListaParticipantes() {
        listaParticipantes = new ArrayList<>();
    }


    public void insertParticipantes(Participantes novoParticipante){
        listaParticipantes.add(novoParticipante);


    } //Adiciona os participantes cadastrados a lista.


    public void listarParticipantes(){

      System.out.println("#---LISTAGEM---#");
        for (Participantes participanteAtivo:listaParticipantes){
            participanteAtivo.listar();
        }
    } //Imprime os participantes da lista.


}
