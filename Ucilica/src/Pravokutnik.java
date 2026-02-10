package src;

public class Pravokutnik {

    private String naziv;
    private double a;
    private double b;

    public Pravokutnik(String naziv, double a, double b) {
        this.naziv = naziv;
        this.a = a;
        this.b = b;
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
}
