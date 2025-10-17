package ar.edu.unahur.obj2.wtoj;
public abstract class Contenido {
    private String titulo;
    private double costoBase;

    public Contenido(String titulo, double costoBase) {
        this.titulo = titulo;
        this.costoBase = costoBase;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getCostoBase() {
        return costoBase;
    }
}
