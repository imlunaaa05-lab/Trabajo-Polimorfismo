abstract class Documento {
    protected String nombre;

    public Documento(String nombre) {
        this.nombre = nombre;
    }

    public abstract String validar();
    public abstract String exportar();
}

class Contrato extends Documento {
    public Contrato(String n) { super(n); }

    public String validar() { return "Contrato validado"; }
    public String exportar() { return "Contrato exportado a PDF"; }
}

class Factura extends Documento {
    public Factura(String n) { super(n); }

    public String validar() { return "Factura validada"; }
    public String exportar() { return "Factura exportada a PDF"; }
}

class Reporte extends Documento {
    public Reporte(String n) { super(n); }

    public String validar() { return "Reporte validado"; }
    public String exportar() { return "Reporte exportado a Excel"; }
}

class Certificado extends Documento {
    public Certificado(String n) { super(n); }

    public String validar() { return "Certificado validado"; }
    public String exportar() { return "Certificado exportado a PDF"; }
}

public class Main {
    public static void main(String[] args) {
        Documento[] docs = {
            new Contrato("Contrato de Trabajo: "),
            new Factura("Factura del gas: "),
            new Reporte("Reporte de asistencias: "),
            new Certificado("Certificado de ingles: ")
        };

        for (Documento d : docs) {
            System.out.println(d.nombre);
            System.out.println("- " + d.validar());
            System.out.println("- " + d.exportar());
        }
    }
}
