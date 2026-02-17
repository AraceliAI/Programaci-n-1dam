public class Trazascomprobante {
    public static void main(String[] args) {
        int i = 0, j = 0, k = 0;
        for (i = 0; i < 3; i++) {
            k = 2;
            j = 1;
            while (j < 3 || k > 0 && i < 2) {
                System.out.printf("[%S]", "hola");k--;j += 2;
            }
        }
        System.out.printf("%ni = |%+05d|%nj = |%+05d|%nk = |%+05d|%n", i, j, k);
    }
}

