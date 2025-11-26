public class Main {
    public static void main(String[] args) {

        for (int number = 1; number <= 9999; number++) {
            if (Armstrong.isArmstrong(number)) {
                System.out.println(number);
            }
        }
    }
}