package com.mycompany.ejer2;

/**
 *
 * @author Camilo
 */
public class Producto {
    private String nombre;
    private double precioUnitario;
    private int cantidad;

    // Constructor
    public Producto(String nombre, double precioUnitario, int cantidad) {
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    // Calcula el precio total del producto
    public double getPrecioTotal() {
        return precioUnitario * cantidad;
    }

    // toString para el formato "Producto;cantidad;precioUnitario;precioTotal"
    @Override
    public String toString() {
        return nombre + ";" + cantidad + ";" + precioUnitario + ";" + getPrecioTotal();
    }
}
    
