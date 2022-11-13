package Evento.Participantes;
import Evento.Participantes.Participantes;

import java.util.ArrayList;
import java.util.Collection;

public class ListaParticipantes {
    ArrayList <Participantes> listaParticipantes;
    ArrayList <Participantes> listaNomes;
    public ListaParticipantes() {
        this.listaParticipantes = new ArrayList<>();
    }


    public void insertParticipantes(Participantes novoParticipante){
        listaParticipantes.add(novoParticipante);
    } //Adiciona os participantes cadastrados a lista.


    //Ordena os participantes em ordem alfabetica.
    public void listarParticipantes(){
        System.out.println("#---LISTAGEM---#");
        for (Participantes participanteAtivo:listaParticipantes){//listaNomes
            participanteAtivo.listar();
        }
    } //Imprime os participantes da lista.
}
