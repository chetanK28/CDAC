public class QE2 {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int testCase1 = 29;
        int testCase2 = 15;

        System.out.println(testCase1 + " is Prime: " + isPrime(testCase1)); // Output: true
        System.out.println(testCase2 + " is Prime: " + isPrime(testCase2)); // Output: false
    }
}
