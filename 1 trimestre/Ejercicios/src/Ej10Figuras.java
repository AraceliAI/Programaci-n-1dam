public class Ej10Figuras {
    public static void main(String[] args) {
        int i,j;
        Boolean e=true;


        for (i=0;i<8;i++){
            for (j=0; j<8; j++){


                if (i%2==0) {
                    if (e) {
                        System.out.print("B  ");
                        e = false;
                    } else {
                        System.out.print("N  ");
                        e = true;
                    }
                }else{
                    if (e) {
                        System.out.print("N  ");
                        e = false;
                    } else {
                        System.out.print("B  ");
                        e = true;
                    }
                }

            }
            System.out.println();
        }
    }
}
