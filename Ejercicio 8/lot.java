abstract class Sensor {
    public abstract String leer();
    public abstract String reportar();
}

class SensorTemperatura extends Sensor {
    public String leer() { return "25°C"; }
    public String reportar() { return "Temperatura calida"; }
}

class SensorMovimiento extends Sensor {
    public String leer() { return "Movimiento humano detectado"; }
    public String reportar() { return "Alerta enviada al Banco"; }
}

public class Main {
    public static void main(String[] args) {
        Sensor[] sensores = {
            new SensorTemperatura(),
            new SensorMovimiento()
        };

        for (Sensor s : sensores) {
            System.out.println("- " + s.leer() + ", "  + s.reportar());
            
        }
    }
}
