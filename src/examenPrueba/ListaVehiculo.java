package examenPrueba;

import java.util.ArrayList;

public class ListaVehiculo {

    private ArrayList<Vehiculo> lista = new ArrayList<>();

    public boolean anadirVehiculo(Vehiculo v) {
        boolean resultado = false;

        if (buscarPorMatricula(v.getMatricula()) == null) {
            lista.add(v);
            resultado = true;
        }

        return resultado;
    }

    public void listarTodos() {
        if (lista.isEmpty()) {
            System.out.println("No hay vehículos registrados.");
        } else {
            for (Vehiculo v : lista) {
                System.out.println(v);
                System.out.println("---------------------------");
            }
        }
    }

    public Vehiculo buscarPorMatricula(String matricula) {
        Vehiculo encontrado = null;

        for (Vehiculo v : lista) {
            if (v.getMatricula().equalsIgnoreCase(matricula)) {
                encontrado = v;
            }
        }

        return encontrado;
    }

    public boolean modificarDiasAlquilados(String matricula, int dias) {
        boolean resultado = false;

        Vehiculo v = buscarPorMatricula(matricula);
        if (v != null) {
            v.setDiaAlquilados(dias);
            resultado = true;
        }

        return resultado;
    }

    public boolean modificarRecargoPremium(String matricula, double porcentaje) {
        boolean resultado = false;

        Vehiculo v = buscarPorMatricula(matricula);
        if (v != null && porcentaje >= 0 && porcentaje <= 25) {
            v.setPorcRecargo(porcentaje);
            resultado = true;
        }

        return resultado;
    }

    public boolean eliminarPorMatricula(String matricula) {
        boolean resultado = false;

        Vehiculo v = buscarPorMatricula(matricula);
        if (v != null) {
            lista.remove(v);
            resultado = true;
        }

        return resultado;
    }

    public double calcularIngresoTotalRecargos() {
        double total = 0;

        for (Vehiculo v : lista) {
            total += v.calcularRecargoPremium();
        }

        return total;
    }

    public void listarVehiculosPremium() {
        for (Vehiculo v : lista) {
            if (v.esRecargoAlto()) {
                System.out.println(v);
                System.out.println("---------------------------");
            }
        }
    }
}