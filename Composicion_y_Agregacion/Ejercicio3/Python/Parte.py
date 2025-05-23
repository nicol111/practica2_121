
class Parte:
    def __init__(self, nombre, peso):
        self.nombre = nombre
        self.peso = peso   
    def mostrar_info(self):
        print(f"\nNombre parte: {self.nombre}")
        print(f"Peso: {self.peso} kg")
    def get_nombre(self):  
        return self.nombre
    def get_peso(self):  
        return self.peso
