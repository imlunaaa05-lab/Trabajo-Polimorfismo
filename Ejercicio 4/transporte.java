abstract class Vehiculo {
    protected String nombre;

    public Vehiculo(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularTarifaMinima();
}

class Bus extends Vehiculo {
    public Bus(String n) {
        super(n);
    }

    public double calcularTarifaMinima() {
        return 4000;
    }
}

class Taxi extends Vehiculo {
    public Taxi(String n) {
        super(n);
    }

    public double calcularTarifaMinima() {
        return 6000;
    }
}

class Uber extends Vehiculo {
    public Uber(String n) {
        super(n);
    }

    public double calcularTarifaMinima() {
        return 10000;
    }
}

public class Main {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = {
            new Bus("Bus"),
            new Taxi("Taxi"),
            new Uber("Uber")
        };

        for (Vehiculo v : vehiculos) {
            System.out.println(v.nombre + ": tarifa minima= " + v.calcularTarifaMinima());
        }
    }
}
