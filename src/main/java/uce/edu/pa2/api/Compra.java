package uce.edu.pa2.api;

public class Compra {

    private String cliente;
    private double subTotal;
    private double total;

    //siempre aplicar el contructor por defecto como buena practica
    public Compra(){

    }

    public Compra(String cliente, double subTotal) {
        this.cliente = cliente;
        this.subTotal = subTotal;
    }

    

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    
}
