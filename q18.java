import java.util.Scanner;

public class q18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int count = 0;
        int temp = Math.abs(number); // Handle negative numbers
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        System.out.println("Number of digits: " + (count == 0 ? 1 : count));


    }
}
