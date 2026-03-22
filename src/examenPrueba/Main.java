package examenPrueba;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ListaVehiculo lista = new ListaVehiculo();

        int opcion = 0;

        do {
            System.out.println("\n--- MENÚ DE GESTIÓN ---");
            System.out.println("1. Añadir vehículo");
            System.out.println("2. Listar vehículos");
            System.out.println("3. Buscar vehículo por matrícula");
            System.out.println("4. Modificar días alquilados");
            System.out.println("5. Modificar recargo premium");
            System.out.println("6. Modificar precio seguro diario");
            System.out.println("7. Eliminar vehículo");
            System.out.println("8. Ver estadísticas");
            System.out.println("9. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Matrícula: ");
                    String mat = sc.nextLine();

                    if (lista.buscarPorMatricula(mat) != null) {
                        System.out.println("ERROR: Ya existe un vehículo con esa matrícula.");
                        break;
                    }

                    System.out.print("Modelo: ");
                    String mod = sc.nextLine();

                    System.out.print("Precio base por día: ");
                    double precio = sc.nextDouble();

                    System.out.print("Porcentaje recargo premium (0-25): ");
                    double rec = sc.nextDouble();

                    Vehiculo v = new Vehiculo(mat, mod, precio, rec, 0);
                    lista.anadirVehiculo(v);
                    System.out.println("Vehículo añadido correctamente.");
                    break;

                case 2:
                    lista.listarTodos();
                    break;

                case 3:
                    System.out.print("Introduce matrícula: ");
                    String m = sc.nextLine();
                    Vehiculo buscado = lista.buscarPorMatricula(m);

                    if (buscado == null) {
                        System.out.println("No existe.");
                    } else {
                        System.out.println(buscado);
                    }
                    break;

                case 4:
                    System.out.print("Matrícula: ");
                    String m4 = sc.nextLine();
                    System.out.print("Nuevo número de días: ");
                    int dias = sc.nextInt();

                    if (lista.modificarDiasAlquilados(m4, dias)) {
                        System.out.println("Modificado correctamente.");
                    } else {
                        System.out.println("No se pudo modificar.");
                    }
                    break;

                case 5:
                    System.out.print("Matrícula: ");
                    String m5 = sc.nextLine();
                    System.out.print("Nuevo porcentaje (0-25): ");
                    double p = sc.nextDouble();

                    if (lista.modificarRecargoPremium(m5, p)) {
                        System.out.println("Modificado correctamente.");
                    } else {
                        System.out.println("Error al modificar.");
                    }
                    break;

                case 6:
                    System.out.print("Nuevo precio seguro diario: ");
                    double nuevo = sc.nextDouble();
                    Vehiculo.setPrecioSeguroDiario(nuevo);
                    System.out.println("Precio actualizado.");
                    break;

                case 7:
                    System.out.print("Matrícula: ");
                    String m7 = sc.nextLine();

                    if (lista.eliminarPorMatricula(m7)) {
                        System.out.println("Eliminado correctamente.");
                    } else {
                        System.out.println("No existe.");
                    }
                    break;

                case 8:
                    System.out.println("Total recargos premium: " + lista.calcularIngresoTotalRecargos());
                    System.out.println("Vehículos premium (>12%):");
                    lista.listarVehiculosPremium();
                    break;

                case 9:
                    System.out.println("Gracias por usar el sistema. ¡Hasta pronto!");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 9);

        sc.close();
    }
}