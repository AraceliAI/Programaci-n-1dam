import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Ejercicio12//
public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        int X,p;
        boolean bobo = false;


        System.out.println("Introduce el tamaño del Array");
         X = sc.nextInt();

        int [] N = new int [X];

         for ( int i = 0; i<N.length; i++){
             N [i] = rnd.nextInt(-100,100);
         }

         do{
             System.out.println("Dime el número que buscas");
             p = sc.nextInt();

             if (p<-100  || p >100){
                 System.out.println("¡Adiós! ᓚᘏᗢ");
             }else{
                 for (int i = 0; i<N.length; i++ ){
                     if (p == N[i]){
                         System.out.println("Este numero se encuentra en el array (^o^)");
                         bobo=true;
                     }
                 }

                 if (bobo == false ){
                     System.out.println("No estaba joder");

                 }
             }


         }while (p>-100 && p<100);
    }
}