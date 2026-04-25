package uce.edu.pa2.api;

import jakarta.enterprise.context.Dependent;

@Dependent
//@ApplicationScoped
public class TrakingVenta {

    
    private long tiempoInicio = 0;
    private long tiempoFinal = 0;

    //si fuese el mismo obejto va ir sumando el tiempo, y la cantidad de operaciones
    private long tiempoTotalAcumulado = 0;
    private int numeroOperaciones = 0;


    public void iniciar(){
        this.tiempoInicio = System.currentTimeMillis();

    }

    public void reiniciar(){
        this.tiempoTotalAcumulado = 0;
        this.numeroOperaciones = 0;

    }

    public void finalizar(){
        long tiempoFinal =  System.currentTimeMillis();
        long tiempoEjecucion = tiempoFinal - tiempoInicio;
        System.out.println("Tiempo ejecución: " + tiempoEjecucion + "ms");

        this.tiempoTotalAcumulado += tiempoEjecucion;
        this.numeroOperaciones++;

        System.out.println("Tiempo ejecución: " + tiempoEjecucion + "ms");
        System.out.println("Tiempo acumulado: " + tiempoTotalAcumulado + "ms");
        System.out.println("Cantidad de operaciones: " + this.numeroOperaciones);

    }
}
