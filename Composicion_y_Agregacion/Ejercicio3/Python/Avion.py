
from Parte import Parte
class Avion:
    def __init__(self, modelo, fabricante, capacidad):
        self.modelo = modelo
        self.fabricante = fabricante
        self.partes = [ ]        
        self.capacidad = capacidad
    def agregar_parte(self, p):
        if len(self.partes) < self.capacidad:
            self.partes.append(p)
        else:
            print("No se pueden agregar más partes al avión.")
            
    def mostrar_avion(self):
        print(f"\nModelo: {self.modelo}")
        print(f"Fabricante: {self.fabricante}")
        print("\n----Partes del avión:----")
        for parte in self.partes:
            parte.mostrar_info()
            
    def get_modelo(self):  return self.modelo
    def get_fabricante(self):  return self.fabricante

