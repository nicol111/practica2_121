
from Casa import Casa
from Habitacion import Habitacion

if __name__ == "__main__":
    print("-------Casa: -------")
    mi_casa = Casa("Calle Flores #123", 5)
    
    h1 = Habitacion("Sala", 20.0)
    h2 = Habitacion("Cocina", 12.5)
    h3 = Habitacion("Dormitorio", 15.0)
    h4 = Habitacion("Baño", 6.0)
    
    mi_casa.agregar_habitacion(h1)
    mi_casa.agregar_habitacion(h2)
    mi_casa.agregar_habitacion(h3)
    mi_casa.agregar_habitacion(h4)
    mi_casa.mostrar_casa()
