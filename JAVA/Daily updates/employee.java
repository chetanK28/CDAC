import java.util.Scanner;

public class Employee {
    int empid;
    String name;
    String City;
    float Salary;

    public void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the empid: ");
        empid = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Enter the name: ");
        name = sc.nextLine();
        System.out.println("Enter the City:");
        City = sc.nextLine();
        System.out.println("Enter the Salary:");
        Salary = sc.nextFloat();
        sc.close();
    }

    public void putdata() {
        System.out.println("Employee id is: " + empid);
        System.out.println("Name is: " + name);
        System.out.println("City is:" +City);
        System.out.println("Salary is: " + Salary);
    }

    public static void main(String args[]) {
        Employee emp = new Employee();
        emp.getdata();
        emp.putdata();
    }
}
