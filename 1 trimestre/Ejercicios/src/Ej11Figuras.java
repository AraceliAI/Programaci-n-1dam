import java.util.Scanner;

public class Ej11Figuras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número filas ");
        int fila = sc.nextInt();
        int i, j, N=0;
        int cont = 0;
        int primero=1;

        for (i=0; i<fila; i++){
            for (j=0; j<5 ; j++){
                if (cont<5) {
                    System.out.print((N += primero) + "    ");
                    cont++;
                }else if (cont==5){
                    cont=1;
                    primero++;
                    N=primero;
                    System.out.print(primero+ "    ");


                }

            }
            System.out.println();
        }



    }
}
