package uce.edu.pa2.api;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProcesadorVentaService1 {

     @Inject //Aqui como iyecto traking se crea un objeto
    private TrakingVenta trakingVenta;

    @Inject
    private EstadisticasVentasGlobales estadisticasVentasGlobales;

    public void procesar1(Venta venta){

        this.trakingVenta.iniciar();
        //inica la venta
        System.out.println("Procesando pedido...");
        //consultando el stock de cada item
        //consultando en la base de datos 
        //finaliza venta
        //voy a simular un tiempo de demora 
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            
        }

        this.trakingVenta.finalizar();



        //registra estdisticas
        this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());
        

    }
}
