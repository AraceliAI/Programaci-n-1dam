import java.util.Scanner;

public class arraysymetodos5 {
    public static void main(String[] args) {
        int[] a = new int[5];
        interior(a);
        int[] b = new int[5];
        sinrepetir(a, b);

        imprimir(a, b);
    }
    public static void interior (int [] a){
        Scanner sc = new Scanner(System.in);
        for (int i =0 ; i<a.length; i++){
            System.out.println("Introduce el valor de la celda " +(i+1));
            a[i]=sc.nextInt();
        }
    }
    public static void sinrepetir (int []a, int[]b){
        int cont = 0;
        for (int i = 0; i< a.length; i++){
            for ( int j= 0; j< a.length; j++){
                if (a[i]== a[j]){
                    cont++;

                    if(i>j){
                        cont++;
                    }
                }
            }
            if (cont == 1 || cont == 2){
                b[i] = a[i];
            } else {
                b[i]= a[i]-1;
            }
            cont=0;
        }
    }

    public static void imprimir (int[]a, int[]b){
        int aux;
        for (int i = 0; i<a.length; i++) {
            aux = a[i];
            System.out.print(aux);
        }

        System.out.println("*****************" );


        for (int i = 0; i<b.length; i++) {
            aux = b[i];
            System.out.print(aux);
        }
    }

}
