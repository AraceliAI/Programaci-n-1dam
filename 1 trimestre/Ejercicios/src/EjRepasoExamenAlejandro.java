import java.util.Scanner;

public class EjRepasoExamenAlejandro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fila, columna, i, j, cont=1;
        int mitad;
        do{
            System.out.println("Dime cual debe ser el número de filas");
            fila = sc.nextInt();

            if (fila%2==0 || fila < 4 ){
                System.out.println( "Las filas deben ser impares y mayores de 4");
            }

        }while (fila%2==0 || fila < 4 );


        do{
            System.out.println("Dime cual debe ser el numero de columnas");
            columna = sc.nextInt();

            if (columna < 2){
                System.out.println( "Las columnas deben ser mayor que 2");
            }

        }while (columna < 2 );

        mitad= fila/2;

        for (i=0; i<fila; i++){
            for (j=0; j< columna; j++){
                if (j==0 || j== columna-1 ) {
                    System.out.print("|");
                }else if (i==0 || i == fila-1){
                    System.out.print("=");
                }else if (i<mitad){
                    System.out.print(cont%10);
                    cont++;
                }else if (mitad==i) {
                    System.out.print("=");
                    cont=9;
                }else{
                    System.out.print(cont%10);
                    cont--;
                }
            }
            System.out.println();
        }
    }
}
