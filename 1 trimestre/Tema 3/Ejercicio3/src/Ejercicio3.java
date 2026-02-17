import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println( "Dime el valor de A:");
        int A = SC.nextInt();
        System.out.println( "Dime el valor de B");
        int B = SC.nextInt();

        System.out.println( "Valores iniciales:");
        System.out.println( "A = " + A );
        System.out.println( "B = " + B );

        int aux = A;
        A = B;
        B = aux;

        System.out.println( "Valores finales: ");
        System.out.println( "A = " + A );
        System.out.println( "B = " + B );


    }
}