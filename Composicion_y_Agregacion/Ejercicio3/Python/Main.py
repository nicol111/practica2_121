
from Avion import Avion
from Parte import Parte

if __name__ == "__main__":
    print("-------Avión: -------")
    avion = Avion("Boeing 747", "Boeing", 5)
    motor = Parte("Motor", 1500.0)   
    ala_izquierda = Parte("Ala Izquierda", 800.0)
    ala_derecha = Parte("Ala Derecha", 800.0)
    tren = Parte("Tren de Aterrizaje", 500.0)  
    cola = Parte("Cola", 400.0)
    
    avion.agregar_parte(motor)
    avion.agregar_parte(ala_izquierda)
    avion.agregar_parte(ala_derecha)
    avion.agregar_parte(tren)
    avion.agregar_parte(cola)
    avion.mostrar_avion()
