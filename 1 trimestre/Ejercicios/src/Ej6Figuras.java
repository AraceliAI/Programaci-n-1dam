import java.util.Scanner;

public class Ej6Figuras {
    public static void main(String[] args) {
        int fila, i, j, cont, inicio;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Introduzca el número de filas");
            fila = sc.nextInt();
            if (fila<0){
                System.out.println("Introduzca un número positivo");
            }
        }while (fila<0);

        j=0;
        inicio=1;

        for (i=0; i<= fila; i++){
            for (j=fila; j > i ; j--){
                System.out.print(inicio++);
                if (inicio > 9 ){
                    inicio=0;
                }
            }
            System.out.println();
        }
    }
}
