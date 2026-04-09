abstract class Notificacion {
    public abstract String enviar(String mensaje);
}

class Correo extends Notificacion {
    public String enviar(String mensaje) {
        return "juanperez@gmail.com te ha enviado este correo: " + mensaje;
    }
}

class SMS extends Notificacion {
    public String enviar(String mensaje) {
        return "SMS enviado por 3208668762: " + mensaje;
    }
}

class Push extends Notificacion {
    public String enviar(String mensaje) {
        return "Notificación push: Juan te ha mandado un mensaje: " + mensaje;
    }
}

class MensajeriaInterna extends Notificacion {
    public String enviar(String mensaje) {
        return "Mensaje interno by Juan: " + mensaje;
    }
}

public class Main {
    public static void main(String[] args) {
        Notificacion[] notificaciones = {
            new Correo(),
            new SMS(),
            new Push(),
            new MensajeriaInterna()
        };

        for (Notificacion n : notificaciones) {
            System.out.println(n.enviar("Hola"));
        }
    }
}
