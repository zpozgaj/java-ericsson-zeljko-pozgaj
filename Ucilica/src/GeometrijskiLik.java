package src;

public abstract class GeometrijskiLik {
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
    public String toString() {
        return naziv +
                " | Površina: " + povrsina() +
                " | Opseg: " + opseg();
    }
}
