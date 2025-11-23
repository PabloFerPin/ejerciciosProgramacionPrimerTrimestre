package Ejercicio1_Alumno;

public class Main {
    public static void main(String[] args) {
        Alumno objAlumno1 = new Alumno("Pablo", 7.87);

        objAlumno1.mostarInformacion();
        boolean resultadoFuncionObj1 = objAlumno1.esAprobado();
        if (resultadoFuncionObj1 == true){
            System.out.println("El alumno ha aprobado");
        } else {
            System.out.println("El alumno ha suspendido");
        }

        Alumno objAlumno2 = new Alumno("Juan", 4.39);

        objAlumno2.mostarInformacion();
        boolean resultadoFuncionObj2 = objAlumno2.esAprobado();
        if (resultadoFuncionObj2 == true){
            System.out.println("El alumno ha aprobado");
        } else {
            System.out.println("El alumno ha suspendido");
        }
    }
}
