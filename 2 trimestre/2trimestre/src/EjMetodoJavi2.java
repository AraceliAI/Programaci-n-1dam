import java.util.Scanner;

public class EjMetodoJavi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("Indica el valor de un número");
            n = sc.nextInt();
        }while (Estaenrango(n)==false);

    }

    public static boolean Estaenrango (int a){
        if (a>49 && a<101){
            return true;
        }else{
            return false;
        }
    }
}
