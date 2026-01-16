package patrones.bridge;

public abstract class Forma {
    private int alto;
    private int ancho;
    protected Color color;

    public Forma(int alto, int ancho, Color color) {
        this.alto = alto;
        this.ancho = ancho;
        this.color = color;
    }

    public abstract void render();

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
}
