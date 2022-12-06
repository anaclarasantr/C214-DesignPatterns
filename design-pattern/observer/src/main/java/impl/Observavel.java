import br.inatel.cdg.interfaces.iObservavel;
import java.util.ArrayList;
import java.util.List;

public class Observavel implements iObservavel {

    private String frase;
    private int qtPalavras, qtPalavrasPares, qtLetrasMaiusculas;
    private List<Observador> clientes;

    public Observavel() {
        clientes = new ArrayList<Observador>();
    }

    @Override
    public void registraObservador(Observador obs) {
        clientes.add(obs);
    }

    @Override
    public void removeObservador(Observador obs) {
        if(clientes.contains(obs))
            clientes.remove(obs);
    }

    @Override
    public void notificaObservadores() {
        for (Observador observador : clientes) {
            observador.update(this);
        }
    }

    private int contPalavrasPares(String[] palavras) {
        int count = 0;
        for(String s: palavras) {
            if(s.length() % 2 == 0){
                count+=1;
            }
        }
        return count;
    }

    private int contLetrasMaiusculas(String[] palavras){
        int count = 0;
        for(int j = 0; j<palavras.length; j++){
            char aux = palavras[j].charAt(0);
            if(Character.isUpperCase(aux) == true){
                count+=1;
            }
        }
        return count;
    }
    private void novasMedidas(String frase) {
        String[] palavrasAux = frase.split(" ");
        int count1 = 0;
        int count2 = 0;

        setQtPalavras(palavrasAux.length);

        count1= contaPalavrasPares(palavrasAux);
        setQtPalavrasPares(count1);

        count2 = contaLetrasMaiusculas(palavrasAux);
        setQtLetrasMaiusculas(count2);

        System.out.println("--------------------- Nova notificação --------------------");
        notificaObservadores();
    }

    public void setNovaFrase(String frase) {
        this.frase = frase;
        novasMedidas(this.frase);
    }

    //Getters e Setters
    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setClientes(List<Observador> clientes) {
        this.clientes = clientes;
    }

    public List<Observador> getClientes() {
        return clientes;
    }

    public int getQtLetrasMaiusculas() {
        return qtLetrasMaiusculas;
    }

    public void setQtLetrasMaiusculas(int qtLetrasMaiusculas) {
        this.qtLetrasMaiusculas = qtLetrasMaiusculas;
    }

    public int getQtPalavrasPares() {
        return qtPalavrasPares;
    }

    public void setQtPalavrasPares(int qtPalavrasPares) {
        this.qtPalavrasPares = qtPalavrasPares;
    }

    public int getQtPalavras() {
        return qtPalavras;
    }

    public void setQtPalavras(int numPalavras) {
        this.qtPalavras = numPalavras;
    }

}
