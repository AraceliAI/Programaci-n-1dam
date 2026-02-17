import java.util.Scanner;
//Ejercicio 1 de la ficha figuras, crear un rectángulo.//
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas, columnas, i, j;
        do {
            System.out.println("Dime el número de filas");
            filas = sc.nextInt();
        }while (filas < 2 );
        do {
            System.out.println("Dime el número de columnas");
            columnas = sc.nextInt();
        }while (columnas <2);

        for ( i = 0; i < filas; i ++){
            for (j = 0; j < columnas; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}