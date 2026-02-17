import java.util.Scanner;

public class EjMetodoJavi3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Indica el valor de n");
        n= sc.nextInt();
        System.out.println(met(n));

    }
    public static int met (int a) {
        int contador = 0;
        for (int i = a; i > 1; i--) {
            if (i % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }
}
