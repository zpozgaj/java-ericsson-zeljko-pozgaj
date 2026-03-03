package src;

public abstract class GeometrijskiLik
        implements Comparable<GeometrijskiLik> {

    private String naziv;

    public GeometrijskiLik(String naziv) {
        this.naziv = naziv;
    }

    public String getNaziv() {
        return naziv;
    }

    public abstract double povrsina();
    public abstract double opseg();

    @Override
    public int compareTo(GeometrijskiLik other) {
        return Double.compare(this.povrsina(), other.povrsina());
    }

    @Override
    public String toString() {
        return naziv +
                " | Površina: " + String.format("%.2f", povrsina()) +
                " | Opseg: " + String.format("%.2f", opseg());
    }
}