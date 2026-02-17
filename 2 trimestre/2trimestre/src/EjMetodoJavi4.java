import java.util.Scanner;

public class EjMetodoJavi4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char primero, segundo;
        System.out.println("Introduce e primer carácter");
        primero = sc.next().charAt(0);
        System.out.println("introduce el segundo carácter");
        segundo = sc.next().charAt(0);

        System.out.println("Al principio sus valores son: " + primero + " " + segundo);
        System.out.println("Después del cambio sus valores son: " + cambio(primero,segundo) + " "+  primero);
    }

    public static char cambio (char a, char b){
        char aux;
        aux=a;
        a=b;
        b=aux;

        return a;
    }
}
