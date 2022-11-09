package Evento;
import java.util.ArrayList;

public class ListaParticipantes {
    ArrayList <Participantes> listaParticipantes;

    public ListaParticipantes() {
        this.listaParticipantes = new ArrayList<>();
    }
    void insertParticipantes(Participantes novoParticipante){
        listaParticipantes.add(novoParticipante);
    }
    void listarParticipantes(){
        System.out.println("#---LISTAGEM---#");
        for (Participantes participanteAtivo:listaParticipantes){
            participanteAtivo.listar();
        }
    }
}
