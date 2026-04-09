from abc import ABC, abstractmethod

class Producto(ABC):
    def __init__(self, nombre, precio):
        self.nombre = nombre
        self.precio = precio

    @abstractmethod
    def calcular_costo(self):
        pass

class ProductoFisico(Producto):
    def calcular_costo(self):
        return self.precio + 10

class ProductoDigital(Producto):
    def calcular_costo(self):
        return self.precio

class Cliente:
    def __init__(self, nombre):
        self.nombre = nombre

class Pedido:
    def __init__(self, cliente):
        self.cliente = cliente
        self.productos = []

    def agregar_producto(self, p):
        self.productos.append(p)

    def mostrar_pedido(self):
        print(f"Cliente: {self.cliente.nombre}")
        total = 0
        for p in self.productos:
            costo = p.calcular_costo()
            print(f"- {p.nombre}: {costo}")
            total += costo
        print("Total:", total)



cliente = Cliente("Santiago")
pedido = Pedido(cliente)

pedido.agregar_producto(ProductoFisico("Laptop", 1000))
pedido.agregar_producto(ProductoDigital("Curso digital", 200))

pedido.mostrar_pedido()
