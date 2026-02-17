import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = input.nextLine();
        System.out.println("Factura de " + nombre);
        System.out.println("Precio del primer producto: ");
        String producto = input.nextLine();
        System.out.println("Precio del segundo producto: ");
        String producto = input.nextLine();

    }
}
