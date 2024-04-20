package Articulos;

import java.util.List;

public abstract class Electronicos {
    private static List<Electronicos> electronicos;

    private String nombre;
    private String modelo;
    private String descripcion;
    private double precio;

    public void nuevoElectronico() {
        nombre = "";
        modelo = "";
        descripcion = "";
        precio = 0;
    }

    public void nuevoElectronico(String nombre, String modelo, String descripcion, double precio) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }


}
