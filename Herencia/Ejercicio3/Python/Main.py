
from Estudiante import Estudiante
from Docente import Docente


print("\n------ Objetos Persona: -----")
print("\nEstudiante 1")
e1 = Estudiante("Juan", "Perez", 123456, 78945612, 10, 4, 1998, 1001, 1, "2017-02-20")
e1.mostrar()
print("\nEstudiante 2")
e2 = Estudiante("Maria", "Lopez", 223344, 78451236, 25, 8, 2002, 1002, 3, "2021-03-15")
e2.mostrar()
print("\nDocente 1")
d1 = Docente("Carlos", "Perez", 998877, 74589632, 30, 12, 1980, "123-NIT", "Ingeniero", "Sistemas", "M")
d1.mostrar()
print("\nDocente 2")
d2 = Docente("Ana", "Garcia", 112233, 71234567, 5, 6, 1985, "456-NIT", "Licenciada", "Matematicas", "F")
d2.mostrar()

print("\n--------- Estudiantes mayores de 25 años: --------")
e1.mayor25()
e2.mayor25()

print("\n------ Docente Masculino Ingeniero Mayor de todos: ------")
mayor = d1 if d1.getEdad() >= d2.getEdad() else d2
if mayor.getProfesion() == "Ingeniero" and mayor.getSexo() == "M":
    mayor.mostrar()
else:
    print("No hay docente masculino ingeniero mayor.")
    
print("\n-----Docentes y Estudiantes con el mismo Apellido: -----")
def compararApellido(p1, p2):
    if p1.getApe().lower() == p2.getApe().lower():
        print("\nCoincidencia detectada:")
        print(f"{p1.getNom()} y {p2.getNom()} comparten el Apellido")
    
compararApellido(e1, d1)           
compararApellido(e1, d2)
compararApellido(e2, d1)
compararApellido(e2, d2)
