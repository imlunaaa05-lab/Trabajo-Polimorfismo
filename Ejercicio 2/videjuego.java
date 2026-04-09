abstract class Entidad {
    protected String nombre;

    public Entidad(String nombre) {
        this.nombre = nombre;
    }

    public abstract void mover();
}

class Jugador extends Entidad {
    public Jugador(String nombre) {
        super(nombre);
    }

    public void mover() {
        System.out.println(nombre + " se mueve como jugador");
    }
}

class Enemigo extends Entidad {
    public Enemigo(String nombre) {
        super(nombre);
    }

    public void mover() {
        System.out.println(nombre + " se mueve como enemigo");
    }
}

class NPC extends Entidad {
    public NPC(String nombre) {
        super(nombre);
    }

    public void mover() {
        System.out.println(nombre + " se mueve como NPC");
    }
}

public class Main {
    public static void main(String[] args) {
        Entidad[] entidades = {
            new Jugador("Heroe Himmel"),
            new Enemigo("Zombie"),
            new NPC("Aldeano")
        };

        for (Entidad e : entidades) {
            e.mover();
        }
    }
}
