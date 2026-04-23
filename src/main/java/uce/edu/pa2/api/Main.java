package uce.edu.pa2.api;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main {


    public static void main(String... args) {

        Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication{
       
        @Inject
        private ProcesadorVentaService procesadorVentaService;
        
        @Inject
        private EstadisticasVentasGlobales estadisticasVentasGlobales;

        @Override
        public int run(String... args) throws Exception {

            Venta v1 = new Venta("Jhon Córdova", 70);
            this.procesadorVentaService.procesar(v1);

            Venta v2 = new Venta("Pedro Paez", 20);
            this.procesadorVentaService.procesar(v2);

            Venta v3 = new Venta("Alex Vivas", 20);
            this.procesadorVentaService.procesar(v3);


            this.estadisticasVentasGlobales.mostrarEstadisticasGlobales();



        return 0;
        }
    }
}

