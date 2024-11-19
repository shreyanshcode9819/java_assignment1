import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks in Mathematics: ");
        int math = scanner.nextInt();

        System.out.print("Enter marks in Physics: ");
        int physics = scanner.nextInt();

        System.out.print("Enter marks in Chemistry: ");
        int chemistry = scanner.nextInt();

        int total = math + physics + chemistry;

        if ((math >= 60 && physics >= 50 && chemistry >= 40) && 
            (total >= 200 || (math + physics >= 150))) {
            System.out.println("The student is eligible for admission.");
        } else {
            System.out.println("The student is not eligible for admission.");
        }

    }
}
