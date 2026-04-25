package uce.edu.pa2.api;

import jakarta.enterprise.context.ApplicationScoped;

//@Dependent
@ApplicationScoped
public class EstadisticasVentasGlobales {

    //son clase que se encargan de mantener el estado
    //las estidisticas de ventas 
    private int totalVentas = 0;
    private double montoTotalVendido = 0;

    public void registrarVenta(double totalVentaIndividual) {
        this.totalVentas++;
        montoTotalVendido += totalVentaIndividual;

    }

    public void mostrarEstadisticasGlobales(){
        System.out.println("ESTADISTICAS GLOBALES");    
        System.out.println("Cantidad de ventas: " + this.totalVentas);    
        System.out.println("Valor total vendido:" + this.montoTotalVendido);    
    }
}
