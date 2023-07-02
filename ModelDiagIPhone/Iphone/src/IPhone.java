import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class IPhone implements AparelhoTelefonico,NavegadorInternet,ReprodutorMusical{
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public void tocar() {
        System.out.println("Tocando Musica");
      
    }

    public void pausar() {
        System.out.println("Pausar Musica");
        }

    public void selecionarMusica() {
        System.out.println("Selecione a Música");
    }

    public void exibirPagina() {
        System.out.println("exibindo página");
    }

    public void adicionarNovaAba() {
        System.out.println("adicionando nova aba no navegador");
    }

    public void atualizarPagina() {
        System.out.println("atualizando página");
    }

    public void atender() {
        System.out.println("atendendo telefone");
    }

    public void ligar() {
        System.out.println("ligando para o contato ...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz");
    }
}
