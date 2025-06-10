package com.mycompany.ejer2;

/**
 *
 * @author Camilo
 */
public class Cliente {
     private String nombre;
    private String direccion;
    private String telefono;

    // Constructor
    public Cliente(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    // toString para los datos del cliente
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nDireccion: " + direccion + "\nTelefono: " + telefono;
    }
}
