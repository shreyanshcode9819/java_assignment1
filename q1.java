import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Conversion Menu:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        double convertedTemperature;

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                convertedTemperature = (celsius * 9 / 5) + 32;
                System.out.printf("Temperature in Fahrenheit: %.2f\n", convertedTemperature);
                break;

            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                convertedTemperature = (fahrenheit - 32) * 5 / 9;
                System.out.printf("Temperature in Celsius: %.2f\n", convertedTemperature);
                break;

            default:
                System.out.println("Invalid choice. Please select 1 or 2.");
        }

       
    }
}
