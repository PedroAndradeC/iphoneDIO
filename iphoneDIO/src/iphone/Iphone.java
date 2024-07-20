package iphone;

import iphone.aparelhoTelefonico.AparelhoTelefonico;
import iphone.navegadorInternet.NavegadorInternet;
import iphone.reprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusicas(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero + " 'TUM TUM TUM...'");
    }

    public void atender() {
        System.out.println("Atendendo chamada.");
    }

    public void iniciarCorreioDeVoz() {
        System.out.println("Correio de voz iniciado.");
    }

    public void exibirPaginas(String url) {
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
}
