
class Habitacion:
    def __init__(self, nombre, tamaño):
        self.nombre = nombre
        self.tamaño = tamaño
        
    def mostrar_casa(self):
        print(f"\nHabitación: {self.nombre}")
        print(f"Tamaño: {self.tamaño} m²")
        
    def get_nombre(self):  
         return self.nombre
    def get_tamaño(self):  
         return self.tamaño
