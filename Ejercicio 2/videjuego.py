from abc import ABC, abstractmethod

class Entidad(ABC):
    def __init__(self, nombre):
        self.nombre = nombre

    @abstractmethod
    def mover(self):
        pass

class Jugador(Entidad):
    def mover(self):
        print(f"{self.nombre} se mueve como jugador")

class Enemigo(Entidad):
    def mover(self):
        print(f"{self.nombre} se mueve como enemigo")

class NPC(Entidad):
    def mover(self):
        print(f"{self.nombre} se mueve como NPC")


entidades = [Jugador("Heroe Himmel"), Enemigo("Demonio"), NPC("Aldeano")]

for e in entidades:
    e.mover()
