package uce.edu.pa2.api;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@MedirTiempo
@Interceptor
@Priority(2)
public class MedirTiempoInterceptor {
    @AroundInvoke //Este metodo se utilizara para ejecutar al rededor de la ejecucion del metodo 
                  //Se va ejecutar al rededor del metodo de negocio
    public Object medir(InvocationContext contex) throws Exception{

        System.out.println("Se ejecuto antes del metodo");

        System.out.println("Metodo interceptado:" + contex.getMethod().getName());

        long inicio = System.currentTimeMillis();
        //inicia la ejecucion del metodo 
        //si no se llama al metodo proceed, nunca se ejecuta el metodo
        Object resultado = contex.proceed();
        
        long fin  = System.currentTimeMillis();

        long tiempoTranscurrido = fin - inicio;
        System.out.println("Tiempo transcurrido: " + tiempoTranscurrido);

        return resultado;

    }

}
