import java.util.Scanner;
public class Producto {
    String nombre;
    double precio;
    int cantidad;
    double descuento = 0.10;

    public Producto() {
    }

    public void ingresarDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto: ");
        this.nombre = sc.nextLine();
        System.out.println("Ingrese el precio del prodcuto: ");
        this.precio = sc.nextDouble();
        System.out.println("Ingrese la cantidad del producto: ");
        this.cantidad = sc.nextInt();
    }


    public void mostrarFactura(){
        System.out.println("Producto: " + nombre);
        System.out.println("Precio unitario: " + precio);
        System.out.println("cantidad: " + cantidad);
        double total = precio * cantidad;
        if (total >= 1000){
            double descuento_unit = total * 0.10;
            System.out.println("Total a pagar: " + (total - descuento_unit));
        } else{
            System.out.println("Toatl a pagar: " + total);
        }
    }
}