import java.util.Scanner;

public class q21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversion Menu:");
        System.out.println("1. Binary to Decimal");
        System.out.println("2. Decimal to Binary");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a binary number: ");
                String binary = scanner.next();
                int decimal = Integer.parseInt(binary, 2);
                System.out.println("Decimal equivalent: " + decimal);
                break;

            case 2:
                System.out.print("Enter a decimal number: ");
                int decimalNumber = scanner.nextInt();
                String binaryEquivalent = Integer.toBinaryString(decimalNumber);
                System.out.println("Binary equivalent: " + binaryEquivalent);
                break;

            default:
                System.out.println("Invalid choice. Please select 1 or 2.");
        }


    }
}
