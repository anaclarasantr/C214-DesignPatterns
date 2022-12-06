import impl.Observador;
import impl.Observavel;

public class Main {

    public static void main(String[] args) {

        // Criando o observavel (subject) palavrasMain.
        Observavel palavras = new Observavel();

        //Criando 3 observadores e fazendo a inscrição em palavrasMain.
        Observador obs1 = new Observador(1);
        Observador obs2 = new Observador(2);
        Observador obs3 = new Observador(3);

        palavras.registraObservador(obs1);
        palavras.registraObservador(obs2);
        palavras.registraObservador(obs3);

        //Novas frases
        palavras.setNovaFrase("Ansiosa para o Fim da Faculdade");
        palavras.setNovaFrase("Deve ser legal ter Tempo");

        //Removendo o primeiro observador
        palavras.removeObservador(obs1);

        //Notificando os clientes que sobraram
        System.out.println("\n\nMandando notificação");
        palavras.notificaObservadores();

    }

}

