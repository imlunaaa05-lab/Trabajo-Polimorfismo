abstract class MetodoPago {
    public abstract String procesar(double monto);
}

class Tarjeta extends MetodoPago {
    public String procesar(double monto) {
        return "Pago de Tarjeta realizado por " + monto;
    }
}

class Nequi extends MetodoPago {
    public String procesar(double monto) {
        return "Pago por Transferencia realizado por " + monto;
    }
}

class Efectivo extends MetodoPago {
    public String procesar(double monto) {
        return "Pago en efectivo realizado por " + monto;
    }
}

public class Main {
    public static void main(String[] args) {
        MetodoPago[] pagos = {
            new Tarjeta(),
            new Nequi(),
            new Efectivo()
        };

        for (MetodoPago p : pagos) {
            System.out.println(p.procesar(100));
        }
    }
}
