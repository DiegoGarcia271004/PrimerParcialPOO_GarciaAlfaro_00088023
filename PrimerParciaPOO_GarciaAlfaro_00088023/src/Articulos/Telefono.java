package Articulos;

import java.util.Scanner;

public class Telefono extends Electronicos implements Especificaciones {
    Scanner sc = new Scanner(System.in);
    private String gamma;
    private String memoria;

    @Override
    public double obtenerPrecio() {
        double precio;
        System.out.print("Ingrese el precio del teléfono: ");
        precio = sc.nextDouble();
        return precio;
    }

    @Override
    public String obtenerDescripcion() {
        String descripcion;
        System.out.print("Ingrese la descripción del teléfono: ");
        descripcion = sc.nextLine();
        return descripcion;
    }

    public Telefono() {
        nuevoElectronico();
        gamma = "";
        memoria = "";
    }

    public Telefono(String nombre, String modelo, String descripcion, double precio, String gamma, String memoria) {
        nuevoElectronico(nombre, modelo, descripcion, precio);
        this.gamma = gamma;
        this.memoria = memoria;
    }

    public String getGamma() {
        return gamma;
    }

    public void setGamma(String gamma) {
        this.gamma = gamma;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }
}
