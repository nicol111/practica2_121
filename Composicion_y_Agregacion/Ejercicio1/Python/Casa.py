
from Habitacion import Habitacion
class Casa:
    def __init__(self, direccion, capacidad):
        self.direccion = direccion
        self.habitaciones = [ ]
        self.capacidad = capacidad
        
    def agregar_habitacion(self, h):
        if len(self.habitaciones) < self.capacidad:
                self.habitaciones.append(h)
        else:
                print("No se pueden agregar más habitaciones.")
    def mostrar_casa(self):
        print(f"\nDirección: {self.direccion}")
        print("\n----Habitaciones:----")
        for i in range(len(self.habitaciones)):
             self.habitaciones[i].mostrar_casa()
    def get_direccion(self):  return self.direccion

