import java.util.Scanner;

public class Ej13Figuras {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int fila, dig, i , j, primero ;

        do{
            System.out.println("¿Qué número de filas te gustaría introducir? ");
            fila = sc.nextInt();
            System.out.println("¿Por cuál dígito deseas comenzar? ");
            dig = sc.nextInt();

            if (fila <2 ){
                System.out.println("Introduzca una fila mayor a 2");
            }else if (dig <0 || dig > 9){
                System.out.println("Introduzca un dígito entre 0-9");
            }

        }while (fila<2 || dig <0 || dig > 9 );

        primero = dig;

        for (i=0; i<=fila; i++){
            for (j=0; j<i; j++){

                if (j==0) {
                    System.out.print(dig++ + "   ");
                    primero = dig;
                    if (dig>9){
                        dig=0;
                    }
                }else{
                    System.out.print(primero++ + "  " );
                    if (primero>9){
                        primero=0;
                    }
                }
            }
            System.out.println();
        }
    }
}
