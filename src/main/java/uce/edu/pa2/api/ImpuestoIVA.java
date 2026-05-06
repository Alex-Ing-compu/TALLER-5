package uce.edu.pa2.api;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ImpuestoIVA implements Impuesto{

    @Override
    public double calcular(double subTotal) {
      System.out.println("Aplicando impuesto IVA");
        return subTotal * 0.15;
    }

   

}
