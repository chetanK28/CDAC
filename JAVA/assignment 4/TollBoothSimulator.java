import java.util.Scanner;

public class TollBoothSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define default toll rates
        double carRate = 50.00;
        double truckRate = 100.00;
        double motorcycleRate = 30.00;

        // Allow user to set toll rates
        System.out.println("Set toll rates for different vehicle types:");
        System.out.print("Enter the toll rate for Car (₹): ");
        carRate = scanner.nextDouble();

        System.out.print("Enter the toll rate for Truck (₹): ");
        truckRate = scanner.nextDouble();

        System.out.print("Enter the toll rate for Motorcycle (₹): ");
        motorcycleRate = scanner.nextDouble();

        // Accept number of vehicles
        System.out.print("Enter the number of Cars passing through: ");
        int numberOfCars = scanner.nextInt();

        System.out.print("Enter the number of Trucks passing through: ");
        int numberOfTrucks = scanner.nextInt();

        System.out.print("Enter the number of Motorcycles passing through: ");
        int numberOfMotorcycles = scanner.nextInt();

        // Calculate total revenue
        double totalRevenue = (numberOfCars * carRate) + (numberOfTrucks * truckRate) + (numberOfMotorcycles * motorcycleRate);

        // Calculate total number of vehicles
        int totalVehicles = numberOfCars + numberOfTrucks + numberOfMotorcycles;

        // Display results
        System.out.printf("Total Number of Vehicles: %d\n", totalVehicles);
        System.out.printf("Total Revenue Collected: ₹%.2f\n", totalRevenue);

        scanner.close();
    }
}
