public class QE6 {

    public static int findSquareRoot(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int start = 1, end = x, result = 0;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (mid * mid == x) {
                return mid;
            }

            if (mid * mid < x) {
                start = mid + 1;
                result = mid;
            } else {
                end = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int testCase1 = 16;
        int testCase2 = 27;

        System.out.println("Square root of " + testCase1 + ": " + findSquareRoot(testCase1)); // Output: 4
        System.out.println("Square root of " + testCase2 + ": " + findSquareRoot(testCase2)); // Output: 5
    }
}
