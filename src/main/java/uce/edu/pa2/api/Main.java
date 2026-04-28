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
        private ProcesadorVentaServiceTiempo procesadorVentaServiceTiempo;
            @Inject
        private InventarioService inventarioService;

        @Override
        public int run(String... args) throws Exception {

            Venta v1 = new Venta("Jhon Córdova", 70);
            Venta v2 = new Venta("Jhon Córdova", 50);

            Venta v3 = new Venta("Alex Córdova", 50);

            this.procesadorVentaServiceTiempo.procesar(v1);
            this.procesadorVentaServiceTiempo.reProcesar(v2);

            System.out.println("Procesando venta con inventario service");
            this.inventarioService.procesar(v3);

        return 0;
        }
    }
}

