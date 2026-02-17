import java.util.Scanner;

public class Ej12Figuras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l,j,i,cont,posicion,N=1;
        cont=1;
        do {
            System.out.println("Dime cual es el número de filas que deseas");
            l = sc.nextInt();
            if ( l < 2 || l > 9 ){
                System.out.println("ERROR");
            }
        }while ( l < 2 || l > 9 );
        posicion=l;
        for (i=0; i<l; i++){
            for (j=0; j<l; j++){

                if(j==(posicion-N)){
                    System.out.print(N + "  ");
                    ++N;

                }else{
                    System.out.print("·   ");
                }

            }
            System.out.println();

        }




    }
}
