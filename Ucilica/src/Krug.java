package src;

public class Krug {

    private String naziv;
    private double r;

    public Krug(String naziv, double r) {
        this.naziv = naziv;
        this.r = r;
    }

    public String getNaziv() {
        return naziv;
    }

    public double getR() {
        return r;
    }
}