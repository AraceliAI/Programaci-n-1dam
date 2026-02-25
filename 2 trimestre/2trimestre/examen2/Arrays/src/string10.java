import java.util.Scanner;
import java.util.StringTokenizer;


public class string10 {
    public static void main(String[] args) {
        String texto = DarValor();
        texto=texto.trim();
        String sinUltimo = SinUlti(texto);
        Leer(texto,sinUltimo);




    }
    public static String DarValor(){
        Scanner sc = new Scanner(System.in);
        String texto;
        do {
            System.out.println(" Indica el contenido de tu string ");
            texto = sc.nextLine();
        }while(texto.isEmpty());

        return  texto;
    }

    public static String SinUlti(String texto){
        int ultimaPosicion = texto.lastIndexOf(" ");

        if (ultimaPosicion == -1) {
            return "";

        }return texto.substring(0, ultimaPosicion);
    }

    public static void Leer (String texto, String sinUltimo){
        System.out.println(texto);
        System.out.println(sinUltimo);
    }



}
