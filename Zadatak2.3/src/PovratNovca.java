import java.util.Scanner;

public class PovratNovca {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesi iznos za povrat: ");
        double iznos = sc.nextDouble();

        double[] novcanice = {
                500, 200, 100, 50, 20, 10, 5,
                2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01
        };

        System.out.println("Vracam:");

        for (int i = 0; i < novcanice.length; i++) {
            int count = (int) (iznos / novcanice[i]);

            if (count > 0) {
                System.out.printf("%d*%.2f%n", count, novcanice[i]);
                iznos -= count * novcanice[i];

                // zaokruživanje zbog problema s double
                iznos = Math.round(iznos * 100.0) / 100.0;
            }
        }

        sc.close();
    }
}
