
class Persona:   

    def __init__(self, nombre, apellido, ci, celular, diaNac, mesNac, anioNac):        
        self.nombre = nombre
        self.apellido = apellido
        self.ci = ci
        self.celular = celular
        self.diaNac = diaNac       
        self.mesNac = mesNac
        self.anioNac = anioNac
    
    def getEdad(self):
        diaAct, mesAct, anioAct = 13, 5, 2025
        edad = anioAct - self.anioNac
        if self.mesNac > mesAct or (self.mesNac == mesAct and self.diaNac > diaAct):
            edad -= 1
            return edad
    def mostrar(self):
        print(f"Nombre y Apellido: {self.nombre} {self.apellido}")
        print(f"CI: {self.ci}")
        print(f"Celular: {self.celular}")
        print(f"Fecha de nacimiento: {self.diaNac} /{self.mesNac} /{self.anioNac}")
        print(f"Edad: {self.getEdad()}")
            
    def getApe(self): return self.apellido
    def getNom(self): return self.nombre
        
    def mayor25(self):
        
        if self.getEdad() > 25:
            print(f"{self.nombre} {self.apellido} tiene {self.getEdad()}")

