import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance in miles: ");
        double miles = scanner.nextDouble();

        // Conversion formula
        double kilometers = miles * 1.60934;

        System.out.println("Distance in kilometers: " + kilometers);

    }
}

