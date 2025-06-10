package com.mycompany.ejer2;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Camilo
 */
public class Factura {
     private static int sigId = 12344; // Inicializamos el contador
    private int numeroFactura;
    private String fecha;
    private Cliente cliente;
    private List<Producto> productos;

    // Constructor
    public Factura(String fecha, Cliente cliente) {
        this.numeroFactura = getSigId(); // Asigna el ID automático
        this.fecha = fecha;
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    // Genera el siguiente ID (privado)
    private static int getSigId() {
        return ++sigId; // Incrementa antes de devolver
    }

    // Añade un producto a la factura
    public void añadirProducto(Producto producto) {
        productos.add(producto);
    }

    // Calcula el subtotal (suma de precios totales)
    public double calcularSubtotal() {
        double subtotal = 0;
        for (Producto producto : productos) {
            subtotal += producto.getPrecioTotal();
        }
        return subtotal;
    }

    // Calcula el IVA (18%)
    public double calcularIVA() {
        return calcularSubtotal() * 0.18;
    }

    // Calcula el total (subtotal + IVA)
    public double calcularTotal() {
        return calcularSubtotal() + calcularIVA();
    }

    // toString con concatenación básica de String
    @Override
    public String toString() {
        String facturaCompleta = ""; // Inicializamos el String

        // Cabecera
        facturaCompleta = facturaCompleta + "Factura nº: " + numeroFactura + "\n";
        facturaCompleta = facturaCompleta + "Fecha: " + fecha + "\n\n";
        facturaCompleta = facturaCompleta + "Datos del cliente\n---\n" + cliente.toString() + "\n\n";
        facturaCompleta = facturaCompleta + "Detalle de la factura\n---\n";
        facturaCompleta = facturaCompleta + "Linea;Producto;Cantidad;Precio ud.;Precio total\n---\n";

        // Productos
        int linea = 1;
        for (Producto producto : productos) {
            facturaCompleta = facturaCompleta + linea + ";" + producto.toString() + "\n";
            linea++;
        }

        // Totales
        facturaCompleta = facturaCompleta + "\nSubtotal: " + String.format("%.2f", calcularSubtotal()) + " €\n";
        facturaCompleta = facturaCompleta + "IVA (18%): " + String.format("%.2f", calcularIVA()) + " €\n";
        facturaCompleta = facturaCompleta + "TOTAL: " + String.format("%.2f", calcularTotal()) + " €";

        return facturaCompleta;
    }
}
