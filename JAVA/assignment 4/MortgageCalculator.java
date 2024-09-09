import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount (₹): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (%): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter the loan term (years): ");
        int loanTermYears = scanner.nextInt();

        double monthlyInterestRate = annualInterestRate / 12 / 100;
        int numberOfMonths = loanTermYears * 12;

        double monthlyPayment = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) 
                                / (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);

        double totalAmountPaid = monthlyPayment * numberOfMonths;

        System.out.printf("Monthly Payment: ₹%.2f\n", monthlyPayment);
        System.out.printf("Total Amount Paid over the life of the loan: ₹%.2f\n", totalAmountPaid);

        scanner.close();
    }
}
