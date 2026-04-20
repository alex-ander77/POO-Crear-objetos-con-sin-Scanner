import java.util.Scanner;
public class Estudiante {
     String nombre;
     String carrera;
     int edad;


    public Estudiante() {
    }

    public void registrarDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre: ");
        nombre = sc.nextLine();
        System.out.println("Carrera: ");
        carrera = sc.nextLine();
        System.out.println("Edad: ");
        edad = sc.nextInt();
    }
    public void mostrarDatos(){
        System.out.println("---DATOS DEL ESTUDIANTE---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Carrera: " + carrera);
        System.out.println("Edad: " + edad);
    }
}
