package uce.edu.pa2.api;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(3)
public class DescuentoSOLCA implements Descuento{

    @Override
    public double aplicar(double valor) {
        System.out.println("Aplicando SOLCA");
        double valorADescontar = valor * 0.20;
        return valor - valorADescontar;
        //return valor * 1.15;
    }

}
