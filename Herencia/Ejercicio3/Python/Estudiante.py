
from Persona import Persona
class Estudiante(Persona):
    def __init__(self, nombre, apellido, ci, celular, d, m, a, ru, sem, fi):
        super().__init__(nombre, apellido, ci, celular, d, m, a)
        self.ru = ru
        self.semestre = sem
        self.fecha_Ingreso = fi
    
    def mostrar(self):
        super().mostrar()
        print(f"RU: {self.ru}")
        print(f"Semestre: {self.semestre}")
        print(f"Fecha de ingreso: {self.fecha_Ingreso}")
