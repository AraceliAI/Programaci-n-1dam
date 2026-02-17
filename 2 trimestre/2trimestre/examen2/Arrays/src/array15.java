import java.util.Random;

public class array15 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int [] n = new int [30];
        int cont=0;

        for (int i=0; i< n.length; i++){
            n [i] = rnd.nextInt(1+1,50+1);
        }
        //Tecniamente hac lo pedido, pero no me gusta que o se muestra en el orden del Array, sino en un orden ascendente.
        /*for (int j=0; j<=50; j++ ) {
            for (int k=0; k<n.length; k++){
                if (j== n[k]){
                    cont++;
                }
            }

            if (cont == 1){
                System.out.println(j);
            }
            cont=0;
        }
        */

        for (int k=0; k<n.length; k++){
            for (int j=0; j<=50; j++){
                if (n[k]==j){
                    cont++;
                }
            }
            if (cont == 1){
                System.out.println(n[k]);
            }
            cont=0;
        }
    }
}
