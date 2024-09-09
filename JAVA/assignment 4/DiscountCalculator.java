import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the original price of the item (₹): ");
        double originalPrice = scanner.nextDouble();

        System.out.print("Enter the discount percentage: ");
        double discountPercentage = scanner.nextDouble();

        double discountAmount = originalPrice * (discountPercentage / 100);
        double finalPrice = originalPrice - discountAmount;

        System.out.printf("Discount Amount: ₹%.2f\n", discountAmount);
        System.out.printf("Final Price: ₹%.2f\n", finalPrice);

        scanner.close();
    }
}
