import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class arrayList4 {
    public static void main(String[] args) {
        ArrayList<Double> v1 = new ArrayList<>();
        ArrayList<Double> v2 = new ArrayList<>();
        introducir(v1,v2);
        leer(v1,v2);
        ArrayList<Double> v3 = pasar(v1,v2);
        leerv3(v3);

    }

    public static void introducir ( ArrayList<Double>v1,ArrayList<Double>v2){

        Scanner sc = new Scanner(System.in);
        int n;
        Double numero;
        System.out.println( "Cual será el valor inicial de los ArraysList");
        n= sc.nextInt();

        for (int i = 0; i<n; i++ ){
            System.out.println("Dale un valor a la casilla " + (i+1) + " del ArrayList v1");
            numero = sc.nextDouble();
            v1.add(numero);
        }

        for (int i = 0; i<n; i++ ){
            System.out.println("Dale un valor a la casilla " + (i+1) + " del ArrayList v2");
            numero = sc.nextDouble();
            v2.add(numero);
        }

    }

    public static void leer ( ArrayList<Double>v1,ArrayList<Double>v2){
        System.out.println("V1=");
        v1.forEach(x -> System.out.println(x));
        System.out.println("V2=");
        v2.forEach(x -> System.out.println(x));
    }

    public static ArrayList<Double> pasar ( ArrayList<Double>v1,ArrayList<Double>v2){
        double a;
        ArrayList <Double> v3 = new ArrayList<>();
        for (int i=0; i<v2.size(); i++){
            v3.add (v2.get(i));
        }
        for (int i=0; i<v1.size(); i++){
            v3.add (v1.get(i));
        }
        return v3;
    }

    public static void leerv3 ( ArrayList<Double>v3){
        System.out.println("V3=");
        v3.forEach(x -> System.out.println(x));
    }


}
