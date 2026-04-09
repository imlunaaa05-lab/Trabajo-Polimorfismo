abstract class Usuario {
    protected String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public abstract String[] acciones();
}

class Estudiante extends Usuario {
    public Estudiante(String n) {
        super(n);
    }

    public String entrarColegio() {
        return "entra al colegio";
    }

    public String asistirClases() {
        return "asiste a clases";
    }

    public String[] acciones() {
        return new String[]{entrarColegio(), asistirClases()};
    }
}

class Docente extends Usuario {
    public Docente(String n) {
        super(n);
    }

    public String darClase() {
        return "da clase";
    }

    public String ponerNotas() {
        return "pone notas";
    }

    public String[] acciones() {
        return new String[]{darClase(), ponerNotas()};
    }
}

class Administrador extends Usuario {
    public Administrador(String n) {
        super(n);
    }

    public String anadirProfesor() {
        return "añade profesores";
    }

    public String anadirEstudiante() {
        return "añade estudiantes";
    }

    public String[] acciones() {
        return new String[]{anadirProfesor(), anadirEstudiante()};
    }
}

public class Main {
    public static void main(String[] args) {
        Usuario[] usuarios = {
            new Estudiante("Juan(Estudiante)"),
            new Docente("Carlos (Docente)"),
            new Administrador("Ana(directora)")
        };

        for (Usuario u : usuarios) {
            System.out.println(u.nombre + ":");
            for (String accion : u.acciones()) {
                System.out.println(" - " + accion);
            }
        }
    }
}
