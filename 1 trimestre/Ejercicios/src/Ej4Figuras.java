import java.util.Scanner;

public class Ej4Figuras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas, i, j,N,horizontal;
        do {
            System.out.println("Dime el número de filas");
            filas = sc.nextInt();
            if ( filas %2== 0 ){
                System.out.println("Introduce un número impar");
            }
        }while (filas %2 == 0 );

        N=0;

        System.out.println( "Figura 1: ");

        for ( i = 0; i < filas; i ++){
            for (j = 0; j < filas; j++) {
                if (N==j) {
                    System.out.print("1");
                }else{
                    System.out.print("*");
                }
            }
            N++;
            System.out.println();
        }

        System.out.println("Figura 2: ");


        horizontal = filas/2 ;

        for ( i = 0; i < filas; i ++) {
            for (j = 0; j < filas; j++) {
                if (horizontal == j) {
                    System.out.print("1  ");
                } else {
                    System.out.print("*  ");
                }

            }
            System.out.println();
        }

        System.out.println( "Figura 3: ");

        for ( i = 0; i < filas; i ++) {
            for (j = 0; j < filas; j++) {
                if (horizontal == i) {
                    System.out.print("1  ");
                } else {
                    System.out.print("*  ");
                }
            }
            System.out.println();
        }
    }
}
