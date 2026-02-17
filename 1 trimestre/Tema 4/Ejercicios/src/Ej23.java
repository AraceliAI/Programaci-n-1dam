import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ej23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Recopilaciónn de dattos//
        System.out.println("Dígame cual es su sexo biológico");
        String sexo = sc.nextLine();
        sexo = sexo.toLowerCase();
        System.out.println("Dígame cual es su edad actual");
        int edad = sc.nextInt();


        // operaciones corespondienes//

        if (sexo.equals("mujer")) {
            int pulsacion = (220 - edad) / 10;
            System.out.println( "Tus pulsaciones deberían ser "  + pulsacion + "por cada 10 seg" );

        } else if (sexo.equals("hombre")) {
            int pulsacion = (210 - edad) / 10;
            System.out.println("Tus pulsaciones deberían ser " + pulsacion + "por cada 10 seg");

        } else {
            System.out.println("No reconozco tu sexo biológico");
        }




    }
}





