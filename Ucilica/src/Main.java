package src;

public class Main {

    public static void main(String[] args) {

        GeometrijskiLik t = new Trokut("Trokut", 3, 4, 5);
        GeometrijskiLik k = new Krug("Krug", 2);
        GeometrijskiLik p = new Pravokutnik("Pravokutnik", 4, 6);

        System.out.println(t);
        System.out.println(k);
        System.out.println(p);
    }
}