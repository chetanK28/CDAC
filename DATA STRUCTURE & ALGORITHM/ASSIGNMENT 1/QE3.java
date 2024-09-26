public class QE3 {

    public static int factorial(int number) {
        int result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int testCase1 = 5;
        int testCase2 = 0;

        System.out.println("Factorial of " + testCase1 + ": " + factorial(testCase1)); // Output: 120
        System.out.println("Factorial of " + testCase2 + ": " + factorial(testCase2)); // Output: 1
    }
}
