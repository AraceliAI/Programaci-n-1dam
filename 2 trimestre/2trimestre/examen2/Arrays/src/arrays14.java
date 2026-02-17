import java.util.Random;
import java.util.Scanner;

public class arrays14 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc= new Scanner(System.in);
        int n;

        System.out.println("dime cual será el numero maximo");
        n= sc.nextInt();

        int [] a = new int [10000];

        for (int i=0;i<a.length; i++){
            a[i]= rnd.nextInt(1,n+1);
        }

        for( int j=1; j<=n; j++){
            int cont=0;
            for (int  i=0;i<a.length; i++){
                if (j == a[i]){
                    cont++;
                }
            }

            System.out.println("El número " + j + " se ha obtenido " + cont++ +" veces.");
        }






    }
}
