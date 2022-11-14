package Evento.Artigos;

import Evento.Artigos.ArtigosCadastrados;

import java.util.ArrayList;

public class ListarArtigos {

ArrayList<ArtigosCadastrados> listaArtigosCadastrados;
    public ListarArtigos(){
        this.listaArtigosCadastrados = new ArrayList<>();
    }
    public void insertArtigos(ArtigosCadastrados novoArtigo){
        this.listaArtigosCadastrados.add(novoArtigo);

    }
}
