
import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a");
        int a = sc.nextInt();
        System.out.println("b");
        int b = sc.nextInt();
        System.out.println("c");
        int c= sc.nextInt();

        if (a > b && a > c){
            System.out.println( "a con el valor de: " + a + "es el número más grande");
        } else if (b > a && b > c) {
            System.out.println("b con el valor de: " + b + "es el número más grande");

        } else if (c>a && c>b) {
            System.out.println("c con el valor de: " + c + "es el número más grande");

        }else if (a == b){
            if (a == c) {
                System.out.println("Todos los números tienen el missmo valor");
            }else if (a > c){
                System.out.println(a +"es mayor que " + c+  " e igual que "+ b);
            }else{
                System.out.println( c +"Es mayor que a y b que stienen el mismo valor" +a );
            }
        } else if (a == c) {
            if (a>b){
                System.out.println(a +"es mayor que b: " + b + "e igual que c: " + c);

            }else{
                System.out.println(b+ "Es mayor que a y b que stienen el mismo valor" +a );
        } if (c == b){
                if (c>a){
                    System.out.println( c+ " Es mayor que" + a + " e igual que " +b);

                }else{
                    System.out.println( a + " es mayor que b y c que tienen el mismo valor" + b);



    }}}}}