import java.util.Scanner;

public class EjMetodoEnrique5 {

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
        factorial(n);

    }

    public static void factorial(int a){
        int aux = 1;
        for ( int i = a; i>0; i --){
            aux*=i;
        }
        System.out.println(aux);

    }
}