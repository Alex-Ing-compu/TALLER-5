package uce.edu.pa2.api;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ImpuestoECOLOGICO implements Impuesto{

    @Override
    public double calcular(double subTotal) {
       System.out.println("Aplicando impuesto ECOLOGICO"); 
       return subTotal * 0.02;
    }

}
