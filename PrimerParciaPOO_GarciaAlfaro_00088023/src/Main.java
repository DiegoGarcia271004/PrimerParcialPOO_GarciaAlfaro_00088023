import Articulos.Electronicos;
import Articulos.Laptop;
import Articulos.Telefono;

import java.util.*;

public class Main {
    private static List<Electronicos> electronicos;

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        electronicos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int option;
        String nombre;
        String modelo;


        while (true) {
            try {
                mostrarMenu();
                option = sc.nextInt();
                sc.nextLine();

                if (option == 5) {
                    System.out.println("Saliendo del sistema...");
                    break;
                }

                switch (option) {
                    case 1:
                        System.out.print("Ingrese el nombre del teléfono: ");
                        nombre = sc.next();
                        sc.nextLine();
                        System.out.print("Ingrese el modelo del teléfono: ");
                        modelo = sc.next();
                        sc.nextLine();
                        System.out.print("Ingrese la gama del telefono: ");
                        String gamma = sc.next();
                        sc.nextLine();
                        System.out.print("Ingrese la memoria del telefono: ");
                        String memoria = sc.next();
                        sc.nextLine();
                        Telefono telefono = new Telefono(nombre, modelo, "", 0, gamma, memoria);
                        telefono.setDescripcion(telefono.obtenerDescripcion());
                        telefono.setPrecio(telefono.obtenerPrecio());
                        electronicos.add(telefono);
                        break;

                    case 2:
                        System.out.print("Ingrese el nombre de la laptop: ");
                        nombre = sc.next();
                        sc.nextLine();
                        System.out.print("Ingrese el modelo de la laptop: ");
                        modelo = sc.next();
                        sc.nextLine();
                        System.out.print("Ingrese la ram de la laptop: ");
                        String ram = sc.next();
                        sc.nextLine();
                        System.out.print("Ingrese el tamaño de la laptop (pulgadas): ");
                        String pulgadas = sc.next();
                        sc.nextLine();
                        Laptop laptop = new Laptop(nombre, modelo, "", 0, ram, pulgadas);
                        laptop.setDescripcion(laptop.obtenerDescripcion());
                        laptop.setPrecio(laptop.obtenerPrecio());
                        electronicos.add(laptop);
                        break;

                    case 3:
                        System.out.println("Ingrese el nombre del dispositivo a modificar: ");
                        String name = sc.next();
                        if (buscarElectronico(name) == null) {
                            break;
                        }
                        System.out.println("Ingrese el nuevo nombre del dispositivo");
                        String newName = sc.next();
                        sc.nextLine();
                        buscarElectronico(name).setNombre(newName);
                        break;
                    case 4:
                        mostrarArticulos();
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("\nPor favor ingrese un dato valido\n");
                sc.nextLine();
            }
        }

    }

    public static void mostrarArticulos() {
        System.out.println("-------Lista------");
        int i = 1;
        for (Electronicos electronicos1 : electronicos) {
            System.out.println("\n" + i + "-------Nombre: " + electronicos1.getNombre() + " ------");
            System.out.println("Modelo: " + electronicos1.getModelo());
            System.out.println("Descripción: " + electronicos1.getDescripcion());
            System.out.println("Precio: " + electronicos1.getPrecio());
            if (electronicos1 instanceof Telefono) {
                System.out.println("Gamma: " + ((Telefono) electronicos1).getGamma());
                System.out.println("Memoria: " + ((Telefono) electronicos1).getMemoria());
            } else if (electronicos1 instanceof Laptop) {
                System.out.println("Ram: " + ((Laptop) electronicos1).getRam());
                System.out.println("Tamaño: " + ((Laptop) electronicos1).getPulgadas());
            }
            i++;
        }
    }

    public static Electronicos buscarElectronico(String nombre) {
        for (Electronicos electronicos1 : electronicos) {
            if (Objects.equals(electronicos1.getNombre(), nombre)) {
                return electronicos1;
            }
        }
        System.out.println("No se encontro el dispositivo.");
        return null;
    }

    public static void mostrarMenu() {
        System.out.println("---------------------");
        System.out.println("Inventario ElectroMart");
        System.out.println("---------------------\n");
        System.out.println("1. Agregar un Teléfono");
        System.out.println("2. Agregar una Laptop");
        System.out.println("3. Modificar");
        System.out.println("4. Mostrar lista de dispositivos");
        System.out.println("5. Salir");
        System.out.println("Ingrese una opcion:");
    }
}