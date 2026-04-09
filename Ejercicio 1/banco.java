abstract class Cuenta {
    protected double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public abstract double calcularInteres();
}

class CuentaAhorro extends Cuenta {
    public CuentaAhorro(double saldo) {
        super(saldo);
    }

    public double calcularInteres() {
        return saldo * 0.02;
    }
}

class CuentaCorriente extends Cuenta {
    public CuentaCorriente(double saldo) {
        super(saldo);
    }

    public double calcularInteres() {
        return saldo * 0.01;
    }
}

class CuentaEmpresarial extends Cuenta {
    public CuentaEmpresarial(double saldo) {
        super(saldo);
    }

    public double calcularInteres() {
        return saldo * 0.03;
    }
}

interface Procesable {
    void procesar(double monto);
}

class Transferencia implements Procesable {
    public void procesar(double monto) {
        System.out.println("Transferencia procesada por " + monto);
    }
}

public class Main {
    public static void main(String[] args) {
        Cuenta[] cuentas = {
            new CuentaAhorro(1000),
            new CuentaCorriente(2000),
            new CuentaEmpresarial(3000)
        };

        for (Cuenta c : cuentas) {
            System.out.println("Interés: " + c.calcularInteres());
        }
    }
}
