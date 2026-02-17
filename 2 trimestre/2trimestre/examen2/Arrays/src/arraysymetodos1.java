import java.util.Scanner;

public class arraysymetodos1 {
    public static void main(String[] args) {

        int [] v1 = new int[5];
        int [] v2 = new int [5];

        interior (v1, v2);
        int [] v3 = concatenar (v1, v2);

        imprimir (v1,v2,v3);
    }

    public static void interior (int [] v1, int [] v2){
        Scanner sc = new Scanner(System.in);
        for (int i =0 ; i<v1.length; i++){
            System.out.println("Introduce el valor de la celda " +(i+1) + "en el array v1");
            v1[i]=sc.nextInt();
        }

        for (int i =0 ; i<v2.length; i++){
            System.out.println("Introduce el valor de la celda " +(i+1) + " en el array v2");
            v2[i]=sc.nextInt();
        }
    }

    public static int[] concatenar (int [] v1, int [] v2){
        int [] patata = new int[v1.length+v2.length];
        for (int i = 0; i<v1.length; i++){
          patata[i] = v1 [i];
        }
        for (int i= 0; i<v2.length;i++){
            patata[i+v1.length] = v2[i];
        }
        return patata;
    }

    public static void imprimir (int[]v1, int[]v2, int[]v3){
        int aux1, aux2, aux3;
        for (int i = 0; i<v1.length; i++) {
            aux1 = v1[i];
            System.out.print(aux1);
        }
        System.out.println();
        for (int j = 0; j<v2.length; j++) {
            aux2 = v2[j];
            System.out.print(aux2);
        }
        System.out.println();
        for (int k = 0; k<v3.length; k++) {
            aux3 = v3[k];
            System.out.print(aux3);
        }

    }
}
