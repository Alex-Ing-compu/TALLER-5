package uce.edu.pa2.api;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ClaseIntermedia {

    @Inject
    private AmbitoAplicacion ambitoAplicacion;

    @Inject
    private AmbitoInject ambitoInject;

    @Inject
    private AmbitoSingleton ambitoSingleton;

    public void imprimirObjetoValor(){
        System.out.println(ambitoAplicacion);
        System.out.println(this.ambitoAplicacion.incrementar());
    }

    public void imprimirObjetoValorInject(){
        System.out.println(ambitoInject);
        System.out.println(this.ambitoInject.incrementar());
    }

    public void imprimirObjetoValorSingleton(){
        System.out.println(ambitoSingleton);
        System.out.println(this.ambitoSingleton.incrementar());
    }

}
