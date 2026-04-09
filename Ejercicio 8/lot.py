from abc import ABC, abstractmethod

class Sensor(ABC):

    @abstractmethod
    def leer(self):
        pass

    @abstractmethod
    def reportar(self):
        pass


class SensorTemperatura(Sensor):
    def leer(self):
        return "25°C"

    def reportar(self):
        return "Temperatura calida"


class SensorMovimiento(Sensor):
    def leer(self):
        return "Movimiento humano detectado"

    def reportar(self):
        return "Alerta enviada al Banco"



sensores = [SensorTemperatura(), SensorMovimiento()]

for s in sensores:
    print("-"+ s.leer() + ", "+ s.reportar())
