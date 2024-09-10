package ejerccio2;

import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) {
        List<veiculos> vehiculos = new ArrayList<>();
        vehiculos.add(new veiculos("Toyota", "Corolla", 3000));
        vehiculos.add(new veiculos("Honda", "Civic", 4500));
        vehiculos.add(new veiculos("Ford", "Fiesta", 3500));
        vehiculos.add(new veiculos("Chevrolet", "Sonic", 2800));

        veiculos vehiculoEncontrado = encontrarVehiculoRango(vehiculos, 2500, 4000);

        if (vehiculoEncontrado != null) {
            System.out.println("Vehículo con el precio más bajo en el rango especificado:");
            System.out.println(vehiculoEncontrado.mostrarDetalles());
        } else {
            System.out.println("No se encontró ningún vehículo en el rango de precios especificado.");
        }
    }

    public static veiculos encontrarVehiculoRango(List<veiculos> vehiculos, double minPrecio, double maxPrecio) {
        veiculos vehiculoEncontrado = null;

        for (veiculos vehiculo : vehiculos) {
            if (vehiculo.getPrecio() >= minPrecio && vehiculo.getPrecio() <= maxPrecio) {
                if (vehiculoEncontrado == null || vehiculo.getPrecio() < vehiculoEncontrado.getPrecio()) {
                    vehiculoEncontrado = vehiculo;
                }
            }
        }

        return vehiculoEncontrado;
    }
}
