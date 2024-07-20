import iphone.Iphone;

public class Usuario {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        // Testando ReprodutorMusical
        iphone.tocar();
        iphone.selecionarMusicas("Imagine - John Lennon");
        iphone.pausar();

        // Testando AparelhoTelefonico
        iphone.ligar("123-4567");
        iphone.atender();
        iphone.iniciarCorreioDeVoz();

        // Testando NavegadorInternet
        iphone.exibirPaginas("www.dio.me");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}