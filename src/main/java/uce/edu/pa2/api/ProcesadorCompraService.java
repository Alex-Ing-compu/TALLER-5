package uce.edu.pa2.api;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProcesadorCompraService {

    //va detectar todas la implementaciones y va dar una lista para poder iterar y usarlas
    @Inject
    private Instance<Descuento> descuentos;


    public void procesar(Compra compra){
        double total = compra.getSubTotal();
        for(Descuento des:descuentos){
            total =  des.aplicar(total);
        }
        compra.setTotal(total);

        System.out.println("Valor a pagar es: " + compra.getTotal());
    }
}
