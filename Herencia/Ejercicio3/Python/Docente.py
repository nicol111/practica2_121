
from Persona import Persona
class Docente(Persona):
    def __init__(self, nombre, apellido, ci, celular, d, m, a, nit, profe, espe, sexo):
        super().__init__(nombre, apellido, ci, celular, d, m, a)
        self.nit = nit
        self.profesion = profe
        self.especialidad = espe
        self.sexo = sexo
        
    def mostrar(self):
        super().mostrar()
        print(f"NIT: {self.nit}")
        print(f"Profesión: {self.profesion}")
        print(f"Especialidad: {self.especialidad}")
        print(f"Sexo: {self.sexo}")
        
    def getProfesion(self):  return self.profesion
    def getSexo(self):  return self.sexo

