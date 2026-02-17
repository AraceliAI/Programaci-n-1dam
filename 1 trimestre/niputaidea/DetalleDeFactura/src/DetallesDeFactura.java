import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DetallesDeFactura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Precio del primer producto:");
        double producto1 = sc.nextDouble();
        System.out.print("Precio del segundo producto:");
        double producto2 = sc.nextDouble();
        double Suma = producto2 + producto1;
        double Impuesto = Suma%19;
        double PrecioFinál = Suma + Impuesto;
        System.out.println("Factura de " + nombre);
        String textoFinal = "El primer producto tiene un coste de " + producto1 + ", el segundo producto tiene un coste de " + producto2 + ". Después de los impuestos el precio final es de "  + PrecioFinál;
        System.out.println(textoFinal);
    }
}