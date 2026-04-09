class Paciente {
    String nombre;

    public Paciente(String nombre) {
        this.nombre = nombre;
    }
}

class Medico {
    String nombre;

    public Medico(String nombre) {
        this.nombre = nombre;
    }

    public String atender(Paciente p) {
        return "Atiende a " + p.nombre;
    }
}

class Cita {
    Paciente paciente;
    Medico medico;

    public Cita(Paciente p, Medico m) {
        this.paciente = p;
        this.medico = m;
    }

    public String resumen() {
        return "Cita: " + medico.nombre + " con " + paciente.nombre;
    }
}

public class Main {
    public static void main(String[] args) {
        Paciente p = new Paciente("Juan Alberto");
        Medico m = new Medico("Dr. Carlos Cruz");
        Cita c = new Cita(p, m);

        System.out.println(c.resumen());
        System.out.println(m.atender(p));
    }
}
