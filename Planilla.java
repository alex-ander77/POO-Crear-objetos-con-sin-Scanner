
import java.util.Scanner;
public class Planilla {

    String nombre;
    double consumo;
    double iva = 0.15;
    double costo = 0.9;
    public Planilla(){

    }
    public double calcularIva(){
        return  consumo * iva;
    }
    public double calcularSubtotal(){
        return consumo * costo;
    }
    public double total (){
        return calcularIva() + calcularSubtotal();
    }
    public void ingresarDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre y apellido");
        this.nombre = sc.nextLine();
        System.out.println("Ingrese el consumo: ");
        this.consumo = sc.nextDouble();
    }
    public void mostrarDatos(){
        System.out.println("---PLANILLA DE LUZ---");
        System.out.println("Cliente: " + nombre);
        System.out.println("Subtotal: "+ calcularSubtotal());
        System.out.println("IVA: " + calcularIva());
        System.out.println("Total a pagar: " + total());


    }
}
