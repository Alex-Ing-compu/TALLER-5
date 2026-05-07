package uce.edu.pa2.api;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(4)
public class DescuentoSPACY implements Descuento{

     @Override
    public double aplicar(double valor) {
        System.out.println("Aplicando SPACY");
        double valorADescontar = valor * 0.50;
        return valor - valorADescontar;
        //return valor * 1.15;
    }

}
