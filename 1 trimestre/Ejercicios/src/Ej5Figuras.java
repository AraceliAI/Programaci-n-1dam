import java.util.Scanner;

public class Ej5Figuras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fila;

        do {
            System.out.println("Dime cuantas filas quieres en tu triángulo");
             fila = sc.nextInt();
        }while ( fila < 0);

        System.out.println("Dime cual debe ser el número inicial");
        int incio = sc.nextInt();
        int i,j,contador;

        contador = incio;


        for (i=0; i<= fila; i++){
            for (j=0; j<=i; j++){
                System.out.print(contador);
                contador--;
                if (contador==-1){
                    contador = 9;
                }
            }
            System.out.println();
        }


    }
}
