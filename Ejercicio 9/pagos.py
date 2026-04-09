from abc import ABC, abstractmethod

class MetodoPago(ABC):

    @abstractmethod
    def procesar(self, monto):
        pass


class Tarjeta(MetodoPago):
    def procesar(self, monto):
        return f"-Pago de Tarjeta realizado por {monto}"


class Nequi(MetodoPago):
    def procesar(self, monto):
        return f"-Pago por Transferencia realizado por {monto}"


class Efectivo(MetodoPago):
    def procesar(self, monto):
        return f"-Pago en efectivo realizado por {monto}"



pagos = [
    Tarjeta(),
    Nequi(),
    Efectivo()
]

for p in pagos:
    print(p.procesar(100))
