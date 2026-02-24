import java.util.ArrayList;
import java.util.Scanner;

public class arrayList7 {
    public static void main(String[] args) {
        ArrayList <Integer> a = new ArrayList<>();
        ArrayList <Integer> b = new ArrayList<>();
        int n= valor();
        a = llenar(n);
        b = ordenar(a);
        leer(a,b);


    }

    public static int valor(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Indica el valor de N");
        int a= sc.nextInt();

        return a;
    }

    public static ArrayList <Integer> llenar ( int n){
        ArrayList <Integer> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for ( int i = 0; i<n; i++ ){
            System.out.println("Añade un valor a la casilla " + (i+1) + " de tu Array");
            int m = sc.nextInt();
            a.add ( m);
        }
        return a;
    }
    public static ArrayList <Integer> ordenar(ArrayList <Integer> a ){

        ArrayList <Integer> b = new ArrayList<>();
        int aux = 0;

        for (int i=0; i<a.size(); i++){
            if (i == 0) {
                aux = a.get(0);
            } else if (a.get(i) < aux) {
                aux = a.get(i);
            }
        }


        b.add(aux);

        for ( int i=0; i< a.size()-2; i++ ){



            for (int j = 0; j < a.size()-2; j++){

                    if ((a.get(i) > aux)&& j==0){
                        aux= a.get(i);
                        System.out.println("a");
                        System.out.println("primer if");
                    }

                    if( a.get(j) > b.get(i) && a.get(j)<=aux){
                        aux = a.get(j);
                        System.out.println("segundo if");
                    }
            }

            b.add(aux);
        }

        for (int i=0; i<a.size(); i++){
            if (i == 0) {
                aux = a.get(0);
            } else if (a.get(i) > aux) {
                aux = a.get(i);
            }

        }

        b.add(aux);


        return b;
    }

    public static void leer (ArrayList<Integer>a, ArrayList<Integer>b){
        //a.forEach(x -> System.out.println(x));
        b.forEach(x -> System.out.println(x));
    }
}


