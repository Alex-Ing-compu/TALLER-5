package uce.edu.pa2.api;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class AmbitoRequest {

     private int contador = 0;

     public int incrementar() {
         
         return ++contador;
     }
}
