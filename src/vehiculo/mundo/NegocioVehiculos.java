package vehiculo.mundo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NegocioVehiculos {
    private List<Vehiculo> vehiculos;

    public NegocioVehiculos() {
        vehiculos = new ArrayList<>();
    }

    // Obtener la lista de todos las placas de los veh�culos que est�n a la venta
    public List<String> obtenerPlacas() {
        return vehiculos.stream()
                .map(Vehiculo::getPlaca)
                .collect(Collectors.toList());
    }

    // Obtener la informaci�n detallada de un veh�culo dada la placa
    public Vehiculo obtenerVehiculoPorPlaca(String placa) {
        return vehiculos.stream()
                .filter(v -> v.getPlaca().equals(placa))
                .findFirst()
                .orElse(null);
    }

    // Agregar un nuevo veh�culo a la venta
    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    // Ordenar la lista de veh�culos por modelo, por marca o por a�o
    public List<Vehiculo> ordenarVehiculos(String criterio) {
        Comparator<Vehiculo> comparator = null;

        switch (criterio.toLowerCase()) {
            case "modelo":
                comparator = Comparator.comparing(Vehiculo::getModelo);
                break;
            case "marca":
                comparator = Comparator.comparing(Vehiculo::getMarca);
                break;
            case "anio":
                comparator = Comparator.comparingInt(Vehiculo::getAnio);
                break;
        }

        if (comparator != null) {
            return vehiculos.stream()
                    .sorted(comparator)
                    .collect(Collectors.toList());
        } else {
            return new ArrayList<>(vehiculos);
        }
    }

    // Hacer una b�squeda de placas usando el modelo y el a�o del veh�culo
    public List<String> buscarPlacasPorModeloAnio(String modelo, int anio) {
        return vehiculos.stream()
                .filter(v -> v.getModelo().equals(modelo) && v.getAnio() == anio)
                .map(Vehiculo::getPlaca)
                .collect(Collectors.toList());
    }

    // Comprar un veh�culo (eliminarlo de la lista de veh�culos que est�n a la venta)
    public boolean comprarVehiculo(String placa) {
        Vehiculo vehiculo = obtenerVehiculoPorPlaca(placa);
        if (vehiculo != null) {
            return vehiculos.remove(vehiculo);
        }
        return false;
    }

    //  Disminuir en un 10% el precio de los veh�culos que tienen un valor mayor a una cantidad dada
    public void aplicarDescuento(double valorMinimo) {
        vehiculos.stream()
                .filter(v -> v.getValor() > valorMinimo)
                .forEach(v -> v.setValor(v.getValor() * 0.9));
    }

    //  Localizar el veh�culo m�s antiguo
    public Vehiculo obtenerVehiculoMasAntiguo() {
        return vehiculos.stream()
                .min(Comparator.comparingInt(Vehiculo::getAnio))
                .orElse(null);
    }

    // Localizar el veh�culo m�s potente (el de m�s cilindrada)
    public Vehiculo obtenerVehiculoMasPotente() {
        return vehiculos.stream()
                .max(Comparator.comparingInt(Vehiculo::getCilindrada))
                .orElse(null);
    }

    //  Localizar el veh�culo m�s barato (el de menor precio).
    public Vehiculo obtenerVehiculoMasBarato() {
        return vehiculos.stream()
                .min(Comparator.comparingDouble(Vehiculo::getValor))
                .orElse(null);
    }
}
