import java.util.Scanner;
public class Calificacion {
    String nombre;
    double nota1;
    double nota2;
    double nota3;

    public Calificacion() {
    }

    public void ingresarDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        this.nombre = sc.nextLine();

        System.out.println("Ingrese su nota 1: ");
        this.nota1 = sc.nextDouble();
        while (nota1 < 0|| nota1 > 10){
            System.out.println("Error, ingrese la nota nuevamente");
            nota1 = sc.nextDouble();
        }

        System.out.println("Ingrese su nota 2: ");
        this.nota2 = sc.nextDouble();
        while (nota2 < 0|| nota2 > 10){
            System.out.println("Error, ingrese su nota nuevamente");
            nota2 = sc.nextDouble();
        }

        System.out.println("Ingrese su nota 3: ");
        this.nota3 = sc.nextDouble();
        while (nota3 < 0|| nota3 > 10){
            System.out.println("Error, ingrese la nota nuevamente");
            nota3 = sc.nextDouble();
        }

    }

    public void mostrarEstado(){
        if (calcularPromedio() >= 7 ) {
            System.out.println("Aprobado");
        }else {
            System.out.println("Reprobado");
        }

    }

    public double calcularPromedio(){
        return (nota1 + nota2 + nota3) / 3;
    }

    public void mostrarDatos(){
        System.out.println("---REPORTE ACADEMICO---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Promedio final: " + calcularPromedio());
    }

}
