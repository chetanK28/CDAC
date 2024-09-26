import java.util.Arrays;

public class QE4 {

    public static int[] fibonacci(int n) {
        int[] fibSeries = new int[n];
        if (n > 0) {
            fibSeries[0] = 0;
        }
        if (n > 1) {
            fibSeries[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            fibSeries[i] = fibSeries[i - 1] + fibSeries[i - 2];
        }
        return fibSeries;
    }

    public static void main(String[] args) {
        int testCase1 = 5;
        int testCase2 = 8;

        System.out.println("First " + testCase1 + " Fibonacci numbers: " + Arrays.toString(fibonacci(testCase1))); // Output: [0, 1, 1, 2, 3]
        System.out.println("First " + testCase2 + " Fibonacci numbers: " + Arrays.toString(fibonacci(testCase2))); // Output: [0, 1, 1, 2, 3, 5, 8, 13]
    }
}
