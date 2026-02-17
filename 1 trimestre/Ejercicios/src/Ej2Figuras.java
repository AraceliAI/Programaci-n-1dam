import java.util.Scanner;

public class Ej2Figuras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas, columnas, i, j , cont;


        do {
            System.out.println("Dime el número de filas");
            filas = sc.nextInt();
        }while (filas < 3);
        do {
            System.out.println("Dime el número de columnas");
            columnas = sc.nextInt();
        }while (columnas<3);

        cont = 0;

        for (i= 0; i < filas; i++){
            for ( j=0; j< columnas;j++ ){
                System.out.print (cont);
                cont++;
                if (cont > 9){
                    cont = 0;
                }
            }
            System.out.println();
        }



    }
}
