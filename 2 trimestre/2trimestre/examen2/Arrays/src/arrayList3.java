import java.util.ArrayList;
import java.util.Scanner;


public class arrayList3 {
    public static void main(String[] args) {
        ArrayList <Integer> a = new ArrayList<>();
        a = llenado();
        leer(a);
        mover(a);
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

        return a;

    }

    public static void leer (ArrayList<Integer>a){
        a.forEach(x -> System.out.println(x));
    }

    public static void mover (ArrayList<Integer>a){



        for (int i = a.size() - 1; i >=0; i--) {
            if (i != 0 ) {
                a.set(i, a.get(i - 1));
            }else{
                a.set(0,a.size());
            }

        }


    }
}
