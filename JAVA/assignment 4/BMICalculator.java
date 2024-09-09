import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight (in kilograms): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height (in meters): ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);

        String classification;

        if (bmi < 18.5) {
            classification = "Underweight";
        } else if (bmi < 24.9) {
            classification = "Normal weight";
        } else if (bmi < 29.9) {
            classification = "Overweight";
        } else {
            classification = "Obese";
        }

        System.out.printf("Your BMI: %.2f\n", bmi);
        System.out.println("Classification: " + classification);

        scanner.close();
    }
}
