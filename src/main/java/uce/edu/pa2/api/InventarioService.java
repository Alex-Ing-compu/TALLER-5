package uce.edu.pa2.api;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class InventarioService {

@MedirTiempo
 public void procesar(Venta venta){

        //inica la venta
        System.out.println("Procesando pedido...");
        System.out.println("Cliente venta a reprocesar: " + venta.getCliente());
        //consultando el stock de cada item
        //consultando en la base de datos 
        //finaliza venta
        //voy a simular un tiempo de demora 
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            
        }

        //registra estdisticas
       // this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());
        System.out.println("Final del metodo");
        System.out.println("Cliente venta a reprocesar: " + venta.getCliente());
        

    }

}
