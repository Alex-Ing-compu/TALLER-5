package uce.edu.pa2.api;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProcesadorVentaServiceTiempo {

    @Inject
    private EstadisticasVentasGlobales estadisticasVentasGlobales;

    
    @MedirTiempo
    @Log
    public void procesar(Venta venta){

        //System.out.println("Entro al metodo con los siguientes valores: " + venta.getCliente());

        //inica la venta
        System.out.println("Procesando pedido...");
        //System.out.println("Cliente venta a reprocesar: " + venta.getCliente());
        //consultando el stock de cada item
        //consultando en la base de datos 
        //finaliza venta
        //voy a simular un tiempo de demora 
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            
        }

        //registra estdisticas
        this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());
        System.out.println("Final del metodo");
        //this.reProcesar(venta); //No se va a ejecutar interceptor del metodo, porque es una llamada interna
        

    }

    @MedirTiempo
    public void reProcesar(Venta venta){

        //inica la venta
        System.out.println("Reprocesar pedido...");
        System.out.println("Cliente venta a reprocesar: " + venta.getCliente());
        //consultando el stock de cada item
        //consultando en la base de datos 
        //finaliza venta
        //voy a simular un tiempo de demora 
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            
        }

        //registra estdisticas
        this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());
        System.out.println("Final del metodo reprocesar");
        

    }
}
