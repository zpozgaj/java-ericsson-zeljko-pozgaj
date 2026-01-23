public class Main {
    public static void main(String[] args) {
    int limit = 300;
    String brojeviZaIspis = "";

    if (limit < 1){
        System.out.println("Limit mora biti veci od nule");
    } else {
        for (int number = 1; number <= limit; number++) {
            if (Armstrong.isArmstrong(number)) {
                if (!brojeviZaIspis.isEmpty()) {
                    brojeviZaIspis +=  ", ";
                }
                brojeviZaIspis += number;
            }
        }
        System.out.println("Armstrongovi brojevi izmedu 1 i " + limit + " su: " + brojeviZaIspis);
    }
    }
}