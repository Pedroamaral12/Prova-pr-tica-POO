package Evento.Artigos;

public class ArtigosCadastrados {

    String titulDoArtigo;
    public ArtigosCadastrados (){

    }
    public ArtigosCadastrados (String tituloDoArtigo){
        setTitulDoArtigo(tituloDoArtigo);
    }

    public String getTitulDoArtigo() {
        return titulDoArtigo;
    }

    public void setTitulDoArtigo(String titulDoArtigo) {
        this.titulDoArtigo = titulDoArtigo;
    }
}
