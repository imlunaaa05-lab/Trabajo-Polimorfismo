from abc import ABC, abstractmethod

class Vehiculo(ABC):
    def __init__(self, nombre):
        self.nombre = nombre

    @abstractmethod
    def calcular_tarifa_minima(self):
        pass

class Bus(Vehiculo):
    def calcular_tarifa_minima(self):
        return 4000

class Taxi(Vehiculo):
    def calcular_tarifa_minima(self):
        return 6000

class Uber(Vehiculo):
    def calcular_tarifa_minima(self):
        return 10000



vehiculos = [
    Bus("Bus"),
    Taxi("Taxi"),
    Uber("Uber")
]

for v in vehiculos:
    print(f"{v.nombre}: tarifa minima = {v.calcular_tarifa_minima()}")
