import java.util.Scanner;

public class BrojacZnakova {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Unesi niz znakova%n");

        String input = scanner.nextLine();

        int slova = 0;
        int brojevi = 0;
        int ostaliZnakovi = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isLetter(c)) {
                slova++;
            } else if (Character.isDigit(c)) {
                brojevi++;
            } else {
                ostaliZnakovi++;
            }
        }

        System.out.printf("Slova: %d%n", slova);
        System.out.printf("Brojevi: %d%n", brojevi);
        System.out.printf("Ostali znakovi: %d%n", ostaliZnakovi);

        scanner.close();
    }
}
