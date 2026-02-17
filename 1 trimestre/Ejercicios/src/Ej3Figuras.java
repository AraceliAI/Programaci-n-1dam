import java.util.Scanner;

public class Ej3Figuras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas, columnas, i, j;
        char caracter;

        System.out.println("Dime el carácter que quieres representar");
        caracter = sc.next().charAt(0);
        do {
            System.out.println("Dime el número de filas");
            filas = sc.nextInt();
        }while (filas < 0 );
        do {
            System.out.println("Dime el número de columnas");
            columnas = sc.nextInt();
        }while (columnas <0);

        for ( i = 0; i < filas; i ++){
            for (j = 0; j < columnas; j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
}



