package Articulos;

import java.util.Scanner;

public class Laptop extends Electronicos implements Especificaciones {
    Scanner sc = new Scanner(System.in);
    private String ram;
    private String pulgadas;

    public Laptop() {
        nuevoElectronico();
        ram = "";
        pulgadas = "";
    }

    public Laptop(String nombre, String modelo, String descripcion, double precio, String ram, String pulgadas) {
        nuevoElectronico(nombre, modelo, descripcion, precio);
        this.ram = ram;
        this.pulgadas = pulgadas;
    }

    @Override
    public double obtenerPrecio() {
        double precio;
        System.out.print("Ingrese el precio de la laptop: ");
        precio = sc.nextDouble();
        return precio;
    }

    @Override
    public String obtenerDescripcion() {
        String descripcion;
        System.out.print("Ingrese la descripción de la laptop: ");
        descripcion = sc.nextLine();
        return descripcion;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(String pulgadas) {
        this.pulgadas = pulgadas;
    }
}
