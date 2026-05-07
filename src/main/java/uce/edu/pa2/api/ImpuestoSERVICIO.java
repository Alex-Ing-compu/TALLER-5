package uce.edu.pa2.api;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ImpuestoSERVICIO implements Impuesto {

    @Override
    public double calcular(double subTotal) {
        System.out.println("Aplicando impuesto SERVICIO");
        return subTotal * 0.05;
    }

}
