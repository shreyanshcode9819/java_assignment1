import java.util.Scanner;

class Commission {
    private double sales;

    public Commission(double sales) {
        if (sales < 0) {
            System.out.println("Invalid Input");
            this.sales = 0;
        } else {
            this.sales = sales;
        }
    }

    public double commission() {
        return sales * 0.10; // Assuming 10% commission
    }
}

public class q33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter sales amount: ");
        double sales = scanner.nextDouble();

        Commission commissionObj = new Commission(sales);

        if (sales >= 0) {
            System.out.printf("Commission: %.2f\n", commissionObj.commission());
        }


    }
}
