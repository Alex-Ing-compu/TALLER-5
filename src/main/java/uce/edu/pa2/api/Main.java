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
        private ProcesadorCompraService procesadorCompraService;

        @Override
        public int run(String... args) throws Exception {

            Compra compra1 = new Compra("Jhon Córdova", 100);
            //Compra compra2 = new Compra("Alex Córdova", 40);
            this.procesadorCompraService.procesar(compra1);

          
        return 0;
        }
    }
}

