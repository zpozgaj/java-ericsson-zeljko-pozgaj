import java.util.Scanner;

public class ObrtanjeRedoslijedaRijeci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Unesi niz znakova%n");

        String input = scanner.nextLine();

        String[] words = input.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]).append(" ");
        }

        System.out.println(result.toString().trim());

        scanner.close();
    }
}