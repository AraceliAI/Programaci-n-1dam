import java.util.Scanner;

public class EjRepasoExamen2Papel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N, i;
        double resultado=0;
        boolean caso=false;
        do{
            System.out.println("Introduce el valor de N");
            N=sc.nextInt();
            if (N<0){
                System.out.println("El númerod ebe ser entero y positivo");
            }
        }while (N<0);

        for (i=1;i<=N;i++){
            if (caso){
                resultado+= Math.pow(2*i,2)/Math.pow(3*i,2);
            }else{
                resultado-=Math.pow(2*i,3)/Math.pow(3*i,3);
            }
            caso=!caso;

        }
        resultado=Math.sqrt(resultado);
        System.out.printf("%.3f%n",resultado);
    }
}
