import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class EjRepasoExamen1Papel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fila,columna,i,j;
        do{
            System.out.println("Indique el número de filas:");
             fila = sc.nextInt();
            if (fila%2==0) {
                System.out.println("El número de filas debe ser impar");
            }else if (fila<4){
                System.out.println("el número de filas debe ser mayor de 4");
            }
        }while (fila%2==0 || fila <4);

        do {
            System.out.println("Indique el número de columnas:");
            columna = sc.nextInt();
            if (columna < 2) {
                System.out.println("El número debe ser como mínimo 3");
            }
        }while (columna<2);

            int contA=1,contB=2,mitad = fila/2;

            for(i=0;i<fila;i++){
                for(j=0;j<columna;j++){
                    if (j==0||j==columna-1){
                        System.out.print("|");
                    } else if (i==0||i==fila-1||i==mitad) {
                        System.out.print("=");
                    } else if (i<mitad) {
                        System.out.print(contA++%10);
                    }else{
                        System.out.print(contB--%10);
                    }
                }
                System.out.println();
            }

        }
    }
