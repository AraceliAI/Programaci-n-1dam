import java.util.Scanner;

public class EjMetodoJavi6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secreto, intento;
        System.out.println("Introduce el número secreto");
        secreto = sc.nextInt();
        System.out.println("te pido que introduzcas el número secreto");
        intento= sc.nextInt();
        verificacion(secreto,intento);
    }
    public static void verificacion(int a, int b){
        if (b == a){
            System.out.println("estas en lo correcto");
        }else if (b<a){
            System.out.println("prueba con un número más alto");
        }else{
            System.out.println("prueba con un número más bajo");
        }
    }
}

