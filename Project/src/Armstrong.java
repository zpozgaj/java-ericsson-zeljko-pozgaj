public class Armstrong {

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sumaKubova = 0;

        while (number > 0) {

            int digit = number % 10;       // Uzmemo zadnju znamenku
            int kub = digit * digit * digit;
            sumaKubova = sumaKubova + kub;

            number = number / 10; // Maknemo zadnju znamenku iz broja
        }

        if (sumaKubova == originalNumber) {
            return true;
        } else {
            return false;
        }
    }
}