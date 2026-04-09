import java.util.*;

abstract class Producto {
    protected String nombre;
    protected double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public abstract double calcularCosto();
}

class ProductoFisico extends Producto {
    public ProductoFisico(String n, double p) {
        super(n, p);
    }

    public double calcularCosto() {
        return precio + 10;
    }
}

class ProductoDigital extends Producto {
    public ProductoDigital(String n, double p) {
        super(n, p);
    }

    public double calcularCosto() {
        return precio;
    }
}

class Cliente {
    String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }
}

class Pedido {
    Cliente cliente;
    List<Producto> productos = new ArrayList<>();

    public Pedido(Cliente c) {
        this.cliente = c;
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void mostrarPedido() {
        System.out.println("Cliente: " + cliente.nombre);
        double total = 0;
        for (Producto p : productos) {
            double costo = p.calcularCosto();
            System.out.println("- " + p.nombre + ": " + costo);
            total += costo;
        }
        System.out.println("Total: " + total);
    }
}

public class Main {
    public static void main(String[] args) {
        Cliente c = new Cliente("Santiago");
        Pedido p = new Pedido(c);

        p.agregarProducto(new ProductoFisico("Laptop", 1000));
        p.agregarProducto(new ProductoDigital("Curso digital", 200));

        p.mostrarPedido();
    }
}
