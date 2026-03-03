package src;

public class Main {

    public static void main(String[] args) {

        Ucilica ucilica = new Ucilica();

        GeometrijskiLik t1 = new Trokut("Trokut 3-4-5", 3, 4, 5);
        GeometrijskiLik k1 = new Krug("Krug r=2", 2);
        GeometrijskiLik p1 = new Pravokutnik("Pravokutnik 4x6", 4, 6);
        GeometrijskiLik t2 = new Trokut("Trokut 5-5-6", 5, 5, 6);

        ucilica.dodaj(t1);
        ucilica.dodaj(k1);
        ucilica.dodaj(p1);
        ucilica.dodaj(t2);

        System.out.println("----- PRIJE SORTIRANJA -----");
        ucilica.ispisiSve();

        ucilica.sortirajPoPovrsini();

        System.out.println("\n----- NAKON SORTIRANJA -----");
        ucilica.ispisiSve();
    }
}