import java.util.Scanner;

public class IT221588402Lab3Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the monthly salary: ");
        double monthlySalary = scanner.nextDouble();

        System.out.print("Enter the number of OT hours: ");
        int otHours = scanner.nextInt();

        System.out.print("Enter the OT hourly rate: ");
        double otHourlyRate = scanner.nextDouble();

        double otAmount = otHours * otHourlyRate;
        double totalSalary = monthlySalary + otAmount;

        System.out.println("The total salary is: " + totalSalary);

        scanner.close();
    }
}
