import java.util.Scanner;
public class Restaurante {
    String nombre;
    String plato;
    double precio;
    int cantidad;
    double descuento = 0.10;

    public Restaurante(){

    }
    public double subTotal(){
        return precio * cantidad;
    }

    public double descuento(){
        if(subTotal() > 25){
            return subTotal() * descuento;
        }else {
            return 0;
        }
    }
    public double precioFinal(){
        return subTotal() - descuento();

    }
    public void ingresarDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        this.nombre = sc.nextLine();
        System.out.println("Ingrese su plato: ");
        this.plato = sc.nextLine();
        System.out.println("Ingrese su precio: ");
        this.precio = sc.nextDouble();
        System.out.println("Ingrese la cantidad: ");
        this.cantidad = sc.nextInt();
    }

    public void mostrarDatos(){
        System.out.println("Cliente: " + nombre);
        System.out.println("Plato: " + plato);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: " + subTotal());
        System.out.println("Descuento: " + descuento());
        System.out.println("Total final: " + precioFinal());
    }
}
