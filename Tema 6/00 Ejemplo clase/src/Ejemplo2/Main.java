package Ejemplo2;

import Ejemplo1.Alumno;

public class Main {
    public static void main(String[] args) {
        Alumno objAlumno = new Alumno(20,"Pepe", 14);
        Profesor objProfesor = new Profesor(10, "Juan");

        objAlumno.mostarInfo();
        objProfesor.mostarInfo();
    }
}
