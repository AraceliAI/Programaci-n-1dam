import java.util.Scanner;

public class EjMetodoEnrique11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("Introduce la tabal que quieres trabajar");
            n= sc.nextInt();
            if (n < 0) {
                System.out.println("La tabla debe ser de un número superior a 0");
            }
        }while (n<0);
        tabla(n);

    }

    public static void tabla(int a){
        for (int i = 0; i<a; i++){
            System.out.println(a + " x " + i + " = " + (a*i));
        }
    }
}
