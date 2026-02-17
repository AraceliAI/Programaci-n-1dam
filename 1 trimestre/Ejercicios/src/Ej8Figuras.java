import java.util.Scanner;

public class Ej8Figuras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, fila, i, j,aux;

        do{
            System.out.println("Indique el número de filas que necesitas");
            fila=sc.nextInt();
            if (fila < 0){
                System.out.println("El número de filas debe ser mayor que 0");
            }

        }while (fila <0);

        N=1;

        for (i=0; i<=fila; i++){
            for (j= fila; j> i; j--){

                if (N==j) {
                    System.out.print(N);
                    N++;


                }else{
                    System.out.print("·  ");
                }
            }
            System.out.println();
        }

    }
}
