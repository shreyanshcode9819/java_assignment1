import java.util.HashMap;
import java.util.Scanner;

public class q29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Duplicate elements and their frequencies:");
        for (int key : frequencyMap.keySet()) {
            if (frequencyMap.get(key) > 1) {
                System.out.println(key + ": " + frequencyMap.get(key) + " times");
            }
        }

    }
}

