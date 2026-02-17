
import java.util.Random;
import java.util.Scanner;

public class arraysmetodos7 {
    public static void main(String[] args) {
        int n = scan ();
        int [] a =  aleatorios(n);
        imprimir (a);
    }

    public static int scan (){
        Scanner sc = new Scanner (System.in);
        int b;
        System.out.println("Introduce cuantos números tendrá el Array");
        b = sc.nextInt();
        return b;
    }

    public static int [] aleatorios (int n){
        Random rd = new Random();
        int [] patata = new int[n];
        for (int i = 0; i<n; i++){
            patata [i] = rd.nextInt(10);
        }
        return patata;
    }


    public static void imprimir (int[]a) {
        int aux1;
        for (int i = 0; i < a.length; i++) {
            aux1 = a[i];
            System.out.println(aux1);
        }

    }
}
