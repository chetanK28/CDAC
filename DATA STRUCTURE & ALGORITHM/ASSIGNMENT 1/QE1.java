public class QE1 {

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int numDigits = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }

        return sum == originalNumber;
    }

    public static void main(String[] args) {
        int testCase1 = 153;
        int testCase2 = 123;

        System.out.println(testCase1 + " is Armstrong: " + isArmstrong(testCase1));
        System.out.println(testCase2 + " is Armstrong: " + isArmstrong(testCase2));
    }
}
