import java.util.Scanner;

public class Ej15Figuras {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i, j, fila, columna;

        do{
            System.out.println(" Indicame el número de columnas");
            columna = sc.nextInt();

            if (columna < 5){
                System.out.println("El número de columnas debe ser mayor que 4 ");

            }
        }while (columna < 5);

        do{
            System.out.println("Indicame el número de filas");
            fila =sc.nextInt();
            if (fila < 5 ){
                System.out.println(" El número de filas debe ser mayor que 4");
            }

            if ( fila%2!=0){
                System.out.println("El número de filas debe ser par ");
            }
        }while (fila < 5 || fila%2!=0);

        for (i=0; i<= columna; i++){
            for ( j = 0; j<= fila; j++){
                if (j==0) {

                    System.out.print("*");

                }else{
                    System.out.print("  0 ");
                }
            }
            System.out.println("");
        }

    }
}
