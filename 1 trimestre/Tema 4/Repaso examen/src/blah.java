import java.util.Scanner;

public class blah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        char respuesta = 0;

        int N;

        do {

            do {

                System.out.println(" Introduce un número del 1 al 3 ᓚᘏᗢ");
                N = sc.nextInt();

                if (N == 1) {
                    ++cont1;
                } else if (N == 2) {
                    ++cont2;
                } else if (N == 3) {
                    ++cont3;
                }


            } while (N>3 && N>1) ;

            if (N>=1 && N<=3 ) {
                System.out.println("¿Deseas continuar? ᓚᘏᗢ(S/N)");
                respuesta = sc.next().charAt(0);

                if (respuesta.equalsIgnoreCase('n')) {

                    if (cont1 > cont2 && cont1 > cont3) {
                        N = 0;
                        System.out.println("1 Es el número que más has utilizado!");

                    } else if (cont2 > cont1 && cont2 > cont3) {
                        N = 0;
                        System.out.println("2 Es el número que más has utilizado!");

                    } else if (cont3 > cont2 && cont3 > cont1) {
                        N = 0;
                        System.out.println("3 Es el número que más has utilizado!");
                    }

                    if (cont1 == 0){
                        System.out.println(" Nunca introdujiste el 1 ");
                    } else if (cont2== 0){
                        System.out.println(" Nunca introdujiste el 2 ");
                    } else if (cont3== 0){
                        System.out.println(" Nunca introdujiste el 3 ");
                    }
                }

            }




        }while (respuesta == ('s'));
    }
}

