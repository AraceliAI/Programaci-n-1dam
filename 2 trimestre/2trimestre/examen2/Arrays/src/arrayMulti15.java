public class arrayMulti15 {
    public static void main(String[] args) {
        int [] a = new int[] {5, 10, -3};
        int [] b = new int [] {1, 7, 14, 9, -1, 20, 32, 44};
        int [] c = new int [] {51, 2, 4, 3, 22};

        int [][] abc = matriz(a,b,c);
        leer(abc);
    }

    public static int [][] matriz (int[]a,int[]b, int[]c){
        int [][] patata = new int[3][];

        for (int i = 0; i<patata.length; i++){


            if (i==0){
                patata[i] = new int [a.length];
                for (int j = 0; j<a.length; j++){
                    patata [i][j] = a [j];
                }
            } else if (i==1) {
                patata[i] = new int [b.length];
                for (int j = 0; j<b.length; j++){
                    patata [i][j] = b [j];
                }
            }else{
                patata[i] = new int [c.length];
                for (int j = 0; j<c.length; j++){
                    patata [i][j] = c [j];
                }
            }
        }
        return patata;
    }

    public static void leer (int [][] abc){
        for(int i = 0; i<abc.length; i++){
            for (int j= 0; j<abc[i].length;j++){
                System.out.print(abc[i][j]+ " ");
            }
        }
    }
}
