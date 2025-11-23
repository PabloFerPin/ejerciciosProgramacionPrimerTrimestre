package Ejemplo1;

import Ejemplo2.Profesor;

public class Main {
    public static void main(String[] args) {
        Alumno objAlumno = new Alumno(20, "Pepe", -17);
        Profesor objProfesor = new Profesor(10, "Juan");

        objAlumno.edad = -19;
        objAlumno.setEdad(-19);

        objAlumno.mostarInfo();
    }
}

