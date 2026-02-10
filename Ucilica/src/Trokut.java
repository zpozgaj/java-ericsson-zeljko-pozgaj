package src;

public class Trokut {

    private String naziv;
    private double a;
    private double b;
    private double c;

    public Trokut(String naziv, double a, double b, double c) {
        this.naziv = naziv;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getNaziv() {
        return naziv;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}
