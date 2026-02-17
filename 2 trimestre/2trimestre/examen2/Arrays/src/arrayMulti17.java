import java.util.Scanner;

public class arrayMulti17 {
    public static void main(String[] args) {
        int n= pedirvalor();
        int [] a = new int [n];
        int [] b = new int [n];
        llenararray(a,b);
        int [][] c = crearMatriz(a,b);
        leermatriz (c,n);
        puntosilla (c);
    }

    public static int pedirvalor(){
        Scanner sc = new Scanner(System.in);
        int p;
        System.out.println("Dime el numero de columnas");
        p = sc.nextInt();

        return p;
    }

    public static void llenararray(int []a, int [] b){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<a.length; i++){
            System.out.println("Dime el valor de la casilla " + (i+1) + "º de a.");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i<b.length; i++){
            System.out.println("Dime el valor de la casilla " + (1+i) + "º de b.");
            b[i] = sc.nextInt();
        }
    }

    public static void leermatriz (int [][] c,int n){
        for(int i = 0; i<c.length; i++){
            for (int j= 0; j<c[i].length;j++){
                System.out.print(c[i][j]+ " ");
            }

            System.out.println();
        }
    }

    public static int[][] crearMatriz(int[]a, int[]b) {
        int[][] patata = new int[2][];
        for (int i = 0; i < patata.length; i++) {
            if (i == 0) {
                patata[i] = new int[a.length];
                for (int j = 0; j < a.length; j++) {
                    patata[i][j] = a[j];
                }
            } else {
                patata[i] = new int[b.length];
                for (int j = 0; j < b.length; j++) {
                    patata[i][j] = b[j];
                }
            }
        }

        return patata;
    }

    public static void puntosilla (int [][] c){
        int auxvalora = 0;
        int auxvalorb= 0;
        int auxcoordya = 0;
        int auxcoordxa = 0;
        int auxcoordyb = 0;
        int auxcoordxb = 0;
        for ( int i = 0; i<c.length; i++){
            for ( int j = 0; j<c[i].length; j++){

                if (i==0) {
                    if (j==0){
                        auxvalora = c[i][j];
                    } else if (c[i][j-1] > c[i][j]) {
                        auxvalora = c[i][j];
                        auxcoordxa = j;
                    }



                } else {

                    if (j == 0) {
                        auxvalorb = c[i][j];
                    } else if (c[i][j-1] > c[i][j]) {
                        auxvalorb = c[i][j];
                        auxcoordyb = i;
                        auxcoordxb = j;

                    }
                }
            }
        }

        if (auxvalora > c[auxcoordxb][auxcoordya] && auxvalorb > c[auxcoordxa][auxcoordyb]){
            System.out.println("Hay dos puntos de silla " + auxvalora + " En la posición c[" +auxcoordxa+ "][" + auxcoordya+ "} y " + auxvalorb + " en la posción c[" + auxcoordxb + "][" + auxcoordyb + "]");
        } else if (auxvalora > c[1][auxcoordya]) {
            System.out.println("Hay un punto de silla "+ auxvalora +  " En la posición c[" +auxcoordxa+ "][" + auxcoordya+ "]");
        } else if (auxvalorb > c[0][auxcoordyb]) {
            System.out.println("Hay un punto de silla "+ auxvalorb +  " En la posición c[" +auxcoordxb+ "][" + auxcoordyb+ "]");

        }else {
            System.out.println("No hay ningún punto de silla");
        }
    }
}