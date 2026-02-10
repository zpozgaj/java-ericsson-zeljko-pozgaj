package src;

public class Main {

    public static void main(String[] args) {

        Trokut trokut = new Trokut("Trokut", 8, 9, 11);
        Krug krug = new Krug("Krug", 5);
        Pravokutnik pravokutnik = new Pravokutnik("Pravokutnik", 7, 6);

        System.out.println(trokut.getNaziv());
        System.out.println(krug.getNaziv());
        System.out.println(pravokutnik.getNaziv());
    }
}