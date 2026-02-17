import java.util.Random;

public class arrayMulti1 {
    public static void main(String[] args) {
        int [][] jude = new int [5][6];
        duarte(jude);
        leer(jude);
    }

    public static void duarte(int [][] jude){
        Random rd = new Random();
        for(int i = 0; i<jude.length; i++){
            for (int j= 0; j<jude[i].length;j++){
                jude[i][j]= rd.nextInt(10);
            }
        }
    }

    public static void leer (int [][] jude) {
        for(int i = 0; i<jude.length; i++){
            for (int j= 0; j<jude[i].length;j++){
                System.out.print(jude[i][j]+ " ");
            }
        }
    }
}
