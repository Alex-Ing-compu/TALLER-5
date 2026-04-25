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
        private ProcesadorVentaEnlineaService procesadorVentaEnlineaService;

        @Inject
        private ProcesadorVentaService procesadorVentaService;

        @Inject
        private ProcesadorVentaService1 procesadorVentaService1;
        
        @Inject
        private EstadisticasVentasGlobales estadisticasVentasGlobales;

        @Override
        public int run(String... args) throws Exception {

            Venta v1 = new Venta("Jhon Córdova", 70);
            this.procesadorVentaService.procesar(v1);

            Venta v2 = new Venta("Pedro Paez", 40);
            this.procesadorVentaService.procesar(v2);

            Venta v3 = new Venta("Alex Vivas", 20);
            this.procesadorVentaService.procesar(v3);


            Venta v4 = new Venta("Alex Vivas", 20);
            this.procesadorVentaService1.procesar1(v4);

            Venta v5 = new Venta("Alex Vivas", 20);
            this.procesadorVentaService1.procesar1(v5);


            System.out.println("*******Con clase procesador venta en linea******");
            Venta v6 = new Venta("Alex Vivas", 20);
            this.procesadorVentaEnlineaService.procesar1(v6);

            Venta v7 = new Venta("Alex Vivas", 20);
            this.procesadorVentaEnlineaService.procesar1(v7);

            this.estadisticasVentasGlobales.mostrarEstadisticasGlobales();
            //this.estadisticasVentasGlobales.registrarVenta(100);



        return 0;
        }
    }
}

