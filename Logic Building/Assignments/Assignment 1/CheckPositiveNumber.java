import java.util.Scanner;

class Positive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        double n = scanner.nextDouble();
        
        // Check if the number is positive or negative
        if (n > 0) {
            System.out.println("Entered number is positive: " + n);
        } else if (n < 0) {
            System.out.println("Entered number is negative: " + n);
        } else {
            System.out.println("Entered number is zero: " + n);
        }

        // Close the scanner
        scanner.close();
    }
}
