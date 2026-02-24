package src;

public class Pravokutnik extends GeometrijskiLik {

    private double a;
    private double b;

    public Pravokutnik(String naziv, double a, double b) {
        super(naziv);
        this.a = a;
        this.b = b;
    }

    @Override
    public double povrsina() {
        return a * b;
    }

    @Override
    public double opseg() {
        return 2 * (a + b);
    }
}
