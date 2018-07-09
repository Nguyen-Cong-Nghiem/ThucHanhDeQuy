public class DaySoFibonaci {
    public static long Fibonaci(int i) {
        if (i < 3) {
            return 1;
        }
        return Fibonaci(i - 1) + Fibonaci(i - 2);

    }

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("fibonaci("+i+")= "+ Fibonaci(i));
        }
    }
}

