import java.util.Scanner;

public class Ej9Figuras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, base, altura;

        do {
            System.out.println("Dime cual es el valor de tu base");
            base = sc.nextInt();
            System.out.println("Dime cual es el valor de tu altura");
            altura = sc.nextInt();

            if (base < 3) {
                System.out.println("La base debe ser al menos de 3 puntos");
            } else if (altura < 3) {
                System.out.println("La altura debe ser al menos de 3 puntos");
            } else if (base == altura) {
                System.out.println("Base y altura deben tener valores diferentes.");
            }
        } while (base < 3 || altura < 3 || base == altura);


        for (i = 0; i < altura; i++) {
            for (j = 0; j < base; j++) {
                if ((j + 1) == base) {
                    System.out.print("*  ");

                } else if ((i + 1) == altura) {
                    System.out.print("*  ");
                } else if (i == 0) {
                    System.out.print("*  ");

                } else if (j == 0) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }


    }
}