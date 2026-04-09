class Paciente:
    def __init__(self, nombre):
        self.nombre = nombre


class Medico:
    def __init__(self, nombre):
        self.nombre = nombre

    def atender(self, paciente):
        return f"Atiende a {paciente.nombre}"


class Cita:
    def __init__(self, paciente, medico):
        self.paciente = paciente
        self.medico = medico

    def resumen(self):
        return f"Cita: {self.medico.nombre} con {self.paciente.nombre}"



p = Paciente("Juan Alberto")
m = Medico("Dr. Carlos Cruz")
cita = Cita(p, m)

print(cita.resumen())
print(m.atender(p))
