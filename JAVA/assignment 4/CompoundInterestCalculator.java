import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial investment amount (₹): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (%): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter the number of times the interest is compounded per year: ");
        int numberOfCompounds = scanner.nextInt();

        System.out.print("Enter the investment duration (years): ");
        int years = scanner.nextInt();

        double futureValue = principal * Math.pow((1 + annualInterestRate / 100 / numberOfCompounds), (numberOfCompounds * years));
        double totalInterest = futureValue - principal;

        System.out.printf("Future Value of Investment: ₹%.2f\n", futureValue);
        System.out.printf("Total Interest Earned: ₹%.2f\n", totalInterest);

        scanner.close();
    }
}
