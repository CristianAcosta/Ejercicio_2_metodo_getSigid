package com.mycompany.ejer2;

/**
 *
 * @author Camilo
 */
public class Ejer2 {

    public static void main(String[] args) {
 // Crear un cliente
        Cliente cliente = new Cliente("Agapito Piedralisa", "c/ Río Seco, 2", "123456789");

        // Crear una factura (el número se genera automáticamente)
        Factura factura = new Factura("18/4/2011", cliente);

        // Añadir productos
        factura.añadirProducto(new Producto("Raton USB", 8.43, 1));
        factura.añadirProducto(new Producto("Memoria RAM 2GB", 21.15, 2));
        factura.añadirProducto(new Producto("Altavoces", 12.66, 1));

        // Imprimir la factura
        System.out.println(factura.toString());
    }
}