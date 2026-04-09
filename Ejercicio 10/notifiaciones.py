from abc import ABC, abstractmethod

class Notificacion(ABC):

    @abstractmethod
    def enviar(self, mensaje):
        pass


class Correo(Notificacion):
    def enviar(self, mensaje):
        return f"juanperez@gmail.com te ha enviado este correo: {mensaje}"


class SMS(Notificacion):
    def enviar(self, mensaje):
        return f"SMS enviado por 3208668762: {mensaje}"


class Push(Notificacion):
    def enviar(self, mensaje):
        return f"Notificación push: Juan te ha mandado un mensaje: {mensaje}"


class MensajeriaInterna(Notificacion):
    def enviar(self, mensaje):
        return f"Mensaje interno by Juan: {mensaje}"


notificaciones = [
    Correo(),
    SMS(),
    Push(),
    MensajeriaInterna()
]

for n in notificaciones:
    print(n.enviar("Hola"))
    
