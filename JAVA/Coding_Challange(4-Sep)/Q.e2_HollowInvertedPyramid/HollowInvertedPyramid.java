public class HollowInvertedPyramid {
    public static void main(String[] args) {
        int n = 6; // Height of pyramid

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= (2 * (n-i) - 1); j++) {
                if (j == 0 || j == (2 *(n-i) - 2) || i == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}

