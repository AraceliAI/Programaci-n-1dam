import java.sql.SQLOutput;
import java.util.Scanner;

public class EjercicioRepasoExamen2Papel {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int aux,N,i,Cont=0;
        do{
            do{
                System.out.println("N?");
                N= sc.nextInt();
            }while(N!=0&&N<9);
            aux= N;

            while(aux!=0){
                aux/=10;
                Cont++;
            }
            aux=N;

            for (i=0;i<aux;i++){
                System.out.print(aux%10);
                aux/=10;

                 if(aux==0){
                    System.out.println();
                }else if(aux%2==0){
                    System.out.print(",");
                }else{
                    System.out.print("-");
                }

            }
            if (N == 0) {
                System.out.print("fin del programa");
            }
        }while(N!=0);
    }
}
