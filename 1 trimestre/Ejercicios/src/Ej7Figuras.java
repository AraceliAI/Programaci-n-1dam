import java.util.Scanner;

public class Ej7Figuras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, fila, N;

        do{
            System.out.println(" Introduce el número de filas");
            fila = sc.nextInt();
            if (fila <0) {
                System.out.println(" El número de filas debe ser positivo ");
            }else if ( fila > 99) {
                System.out.println(" el número de filas debe ser menor a 100");
            }
        }while (fila <0 || fila >99);
         N=1;
        for (i=0; i<=fila; i++){
            for ( j = fila; j> i; j--){
                System.out.print(N++);
                if (N==fila+1){
                    N=i+2;
                }
            }
            System.out.println();
        }
    }
}
