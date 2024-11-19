public class q23a {
    public static void main(String[] args) {
        int count = 1;

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}

