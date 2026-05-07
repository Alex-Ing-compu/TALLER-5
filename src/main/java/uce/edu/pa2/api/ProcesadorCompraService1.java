package uce.edu.pa2.api;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProcesadorCompraService1 {

    @Inject
    private Instance<Impuesto> impuestos;

    public void procesarCompra(Compra compra){
        double subTotal = compra.getSubTotal();
        double totalImpuesto = 0;

        for (Impuesto imp : impuestos) {
            double valor = imp.calcular(subTotal);
            totalImpuesto += valor;
        }
        
        double total = subTotal + totalImpuesto;
        System.out.println("Su valor total a pagar es: " + total);
        
    }
}
