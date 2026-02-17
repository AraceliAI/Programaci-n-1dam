import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la variable de x");
        int variableX = sc.nextInt();
        System.out.println("Dime la variable de Y");
        int variableY= sc.nextInt();
        System.out.println("Dime la variable de M" );
        double variableM =sc.nextDouble();
        System.out.println("Dime la variable de N");
        double variableN =sc.nextDouble();

        System.out.println("Variable x = " + variableX);
        System.out.println("Variable y = " + variableY);
        System.out.println("Variable m = " + variableM);
        System.out.println("Variable n = " + variableN);

        System.out.println( variableX + "+" + variableY + "=" + (variableX + variableY));
        System.out.println( variableX + "-" + variableY + "=" + (variableX - variableY));
        System.out.println( variableX + "*" + variableY + "=" + (variableX * variableY));
        System.out.println( variableX + "/" + variableY + "=" + (variableX / variableY));
        System.out.println( variableX + "%" + variableY + "=" + (variableX % variableY));

        System.out.println( variableN + "+" + variableM + "=" + (variableN + variableM));
        System.out.println( variableN + "-" + variableM + "=" + (variableN - variableM));
        System.out.println( variableN + "*" + variableM + "=" + (variableN * variableM));
        System.out.println( variableN + "/" + variableM + "=" + (variableN / variableM));
        System.out.println( variableN + "%" + variableM + "=" + (variableN % variableM));

        System.out.println( variableX + "+" + variableN + "=" + (variableX + variableN));

        System.out.println( variableY + "/" + variableM + "=" + (variableY / variableM));
        System.out.println( variableY + "%" + variableM + "=" + (variableY % variableM));

        System.out.println( "Variable x = " + variableX + "el doble es" + (variableX * 2));
        System.out.println( "Variable y = " + variableY + "el doble es" + (variableY * 2));
        System.out.println( "Variable M = " + variableM + "el doble es" + (variableM * 2));
        System.out.println( "Variable N = " + variableN + "el doble es" + (variableN * 2));

        System.out.println( variableX + "+" + variableM + "+" + variableY + "+" + variableN + "=" + (variableM + variableN + variableY + variableX));

        System.out.println( variableX + "*" + variableM + "*" + variableY + "*" + variableN + "=" + (variableX * variableY * variableM * variableN));
        }

    }
