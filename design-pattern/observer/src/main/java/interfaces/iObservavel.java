package br.inatel.cdg.interfaces;
import br.inatel.cdg.impl.Observador;

public interface iObservavel {

    public void registraObservador(Observador obs);
    public void removeObservador(Observador obs);
    public void notificaObservadores();

}
