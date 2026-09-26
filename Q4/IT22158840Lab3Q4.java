import java.util.Scanner;

public class IT22158840Lab3Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt();

        if (number >= 10000 && number <= 99999) {
            System.out.print("Output → ");
            while (number > 0) {
                System.out.print((number / 10000) + " ");
                number %= 10000;

                System.out.print((number / 1000) + " ");
                number %= 1000;

                System.out.print((number / 100) + " ");
                number %= 100;

                System.out.print((number / 10) + " ");
                number %= 10;

                System.out.print(number);
                break;
            }
        } else {
            System.out.println("Please enter a valid five-digit number.");
        }

        scanner.close();
    }
}
