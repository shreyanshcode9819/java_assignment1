import java.util.Scanner;

public class q28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter the elements:");
        int sum = 0;

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] % 2 != 0) {
                sum += numbers[i];
            }
        }

        System.out.println("The sum of odd numbers is: " + sum);


    }
}
