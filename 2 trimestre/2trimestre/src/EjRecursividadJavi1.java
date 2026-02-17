import org.w3c.dom.ls.LSOutput;
/*
import java.util.Scanner;

public class EjRecursividadJavi1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fin;
        do {
            System.out.println("dime el número que indique el final");
            fin = sc.nextInt();

            if (fin > 41 || fin < 0) {
                System.out.println("Por favor, trata de que tu elección sea menor de 40 y mayor de 0");
            }

        } while (fin > 41 || fin < 0);

        int copia=fin;

        fibonnacci(fin,copia);
    }

    public static int fibonnacci(int a,int b) {

        if (a==b){
            int aux1 = 0;
            int aux2 = 1;
            boolean bobo = true;
        }


        if (aux1 == 0) {
            aux1++;
            a--;
            return  fibonnacci(a);
        } else if (aux1 == 1) {
            aux1++;
            a--;
            return 1 + fibonnacci(a);
        } else if (bobo && a > 0) {
            bobo = !bobo;
            aux1 += aux2;
            --a;
            return aux1 + fibonnacci(a);

        } else if (bobo == false && a > 0) {
            bobo = !bobo;
            aux2 += aux1;
            --a;
            return aux2 + fibonnacci(a);

        } else if (bobo && a == 0) {
            return aux1;

        } else {
            return aux2;
        }
    }
}
*/


