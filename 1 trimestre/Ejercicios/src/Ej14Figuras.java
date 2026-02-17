import java.util.Scanner;

public class Ej14Figuras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  i, j, fila;
        int N=  1;

        do{
            System.out.println(" Indicame el número de filas ");
            fila = sc.nextInt();
            if ( fila < 2) {
                System.out.println(" Tu fila debe ser mayor de 1 ");
            }


        } while (fila < 2);


            for (i=0; i<fila; i++){
                for (j=0; j<fila; j++ ){

                    if( j <= i) {
                        N%=10;
                        System.out.print(N++ + "  ");
                    }else{
                        System.out.print("*  ");
                    }
                }
                System.out.println();
            }


    }
}


