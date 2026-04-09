from abc import ABC, abstractmethod


class Cuenta(ABC):
    def __init__(self, saldo):
        self.saldo = saldo

    @abstractmethod
    def calcular_interes(self):
        pass


class CuentaAhorro(Cuenta):
    def calcular_interes(self):
        return self.saldo * 0.02

class CuentaCorriente(Cuenta):
    def calcular_interes(self):
        return self.saldo * 0.01

class CuentaEmpresarial(Cuenta):
    def calcular_interes(self):
        return self.saldo * 0.03


class Procesable(ABC):
    @abstractmethod
    def procesar(self, monto):
        pass


class Transferencia(Procesable):
    def procesar(self, monto):
        print(f"Transferencia procesada por {monto}")


cuentas = [CuentaAhorro(1000), CuentaCorriente(2000), CuentaEmpresarial(3000)]

for c in cuentas:
    print("Interés:", c.calcular_interes())
