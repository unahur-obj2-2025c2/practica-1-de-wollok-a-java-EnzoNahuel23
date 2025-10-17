package ar.edu.unahur.obj2.wtoj;
public class Documental extends Contenido{
    private double canonIdra = 0.5;
    public Documental(String titulo, int costoBase) {
        super(titulo, costoBase);
    }

    public double getCanonIdra() {
        return canonIdra;
    }

    public void setCanonIdra(double canonIdra) {
        this.canonIdra = canonIdra;
    }

    public double costoFinal() {
        return this.getCostoBase() + this.getCanonIdra();
    }
}
