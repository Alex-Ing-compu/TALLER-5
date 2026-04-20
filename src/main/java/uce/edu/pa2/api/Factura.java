package uce.edu.pa2.api;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Factura implements ComprobanteEstrategia{

    @Override
    public void comprobante(Pedido pedido) {
        
        if(pedido.getDestino() == null){
        System.out.println("Comprobante Fisico" );
        System.out.println("Nombre" + pedido.getCliente());
        System.out.println("Producto" + pedido.getProducto());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Gracias por su compra");
        }else{
            ComprobantePDF comprobantePDF = new ComprobantePDF();
            comprobantePDF.comprobante(pedido);
        }
        
    }

}
