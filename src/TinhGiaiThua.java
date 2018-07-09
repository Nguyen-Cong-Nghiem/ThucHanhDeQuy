

import java.util.Scanner;

public class TinhGiaiThua {
    public static long giaithua(int n) {

        if (n == 0) {
            return 1;
        }
        return n * giaithua(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Giai thua cua 5 la: " + giaithua(6));
    }
}
