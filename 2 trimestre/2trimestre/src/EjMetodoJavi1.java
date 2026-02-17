import java.util.Scanner;

public class EjMetodoJavi1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int primero, segundo, resultado=1;
        System.out.println("Indica el valor del primer número");
        primero = sc.nextInt();
        System.out.println("Indica el valor del segundo número");
        segundo= sc.nextInt();

        for (int i=1; i<=3; i++ ){
            if(i==1) {
                resultado = aumento(primero, segundo);
            }
            System.out.println(resultado++);
        }
    }
    public static int aumento (int a, int b){
        a*=2;
        a+=b;
        return a;
    }
}
