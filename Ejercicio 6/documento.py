from abc import ABC, abstractmethod

class Documento(ABC):
    def __init__(self, nombre):
        self.nombre = nombre

    @abstractmethod
    def validar(self):
        pass

    @abstractmethod
    def exportar(self):
        pass


class Contrato(Documento):
    def validar(self):
        return "Contrato validado"

    def exportar(self):
        return "Contrato exportado a PDF"


class Factura(Documento):
    def validar(self):
        return "Factura validada"

    def exportar(self):
        return "Factura exportada a PDF"


class Reporte(Documento):
    def validar(self):
        return "Reporte validado"

    def exportar(self):
        return "Reporte exportado a Excel"


class Certificado(Documento):
    def validar(self):
        return "Certificado validado"

    def exportar(self):
        return "Certificado exportado a PDF"


docs = [
    Contrato("Contrato de Trabajo: "),
    Factura("Factura del gas: "),
    Reporte("Reporte de asistencias: "),
    Certificado("Certificado de ingles: ")
]

for d in docs:
    print(d.nombre)
    print("-", d.validar())
    print("-", d.exportar())
    
