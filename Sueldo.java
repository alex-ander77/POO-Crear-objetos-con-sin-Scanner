import java.util.Scanner;
public class Sueldo {
    String nombre;
    double horasTrabajadas;
    double pagoHora;
    double sueldo_base = 470;
    double bono = 2.5;

    public Sueldo(){

    }

    public double calcularBono(){
        return pagoHora * bono;
    }
    public double calcularSueldo(){
        return sueldo_base + calcularBono();
    }

    public void ingresarDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre y apellido: ");
        this.nombre = sc.nextLine();
        System.out.println("Ingrese las horas trabajadas: ");
        this.horasTrabajadas = sc.nextDouble();
        System.out.println("Ingrese el pago por su hora de trabajo: ");
        this.pagoHora = sc.nextDouble();
    }
    public void mostrarDatos(){
        System.out.println("---REPORTE DE EMPLEADO---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Sueldo Base: " + sueldo_base);
        System.out.println("Bono: " + calcularBono());
        System.out.println("Sueldo final: " + calcularSueldo());
    }
}
