import java.util.Scanner;

public class EjRepasoExamen2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N,A = 2, B=3,contN=0, valorA, valorB,fraccion;
        boolean exponente = true, NegPos = true;
         do{
            System.out.println("Cual es el valor de N");
            N = sc.nextInt();
         }while (N<=1);

         do{
             if (exponente){
                 exponente=false;
                  valorA= A*A;
                 valorB= B*B*B;
             }else{
                 exponente=true;
                 valorA= A*A*A;
                 valorB=B*B;
             }
             fraccion= valorA / valorB;

             if (NegPos){
                 NegPos=false;
                 fraccion =-(fraccion*2);
             }else{
                 NegPos=true;
             }

             ++contN;
             A+=2;
             B+=3;

         }while(contN<N);




    }

}
