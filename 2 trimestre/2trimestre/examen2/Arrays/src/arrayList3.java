import java.util.ArrayList;
import java.util.Scanner;

public class arrayList3 {
    public static void main(String[] args) {
        ArrayList <Integer> a = new ArrayList<>();
        a = llenado();
        leer(a);
    }

    public static ArrayList <Integer> llenado (){
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> a = new ArrayList<>();
        int n, m;
        System.out.println("Indica el número máximo del arrayList");
        n = sc.nextInt();

        for (int i= 0; i<n; i++){
            System.out.println("Dame u n valor");
            m = sc.nextInt();
            a.add(m);
        }

        for (int i=0; i<n; i++){
            m= a.get(i);
            a.set (n--, m);
            a.remove(0);
        }

        return a;

    }

    public static void leer (ArrayList<Integer>a){
        a.forEach(x -> System.out.println(x));
    }
}
