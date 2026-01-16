package patrones.bridge;

public class FormaCirculo extends Forma{

    public FormaCirculo(int alto, int ancho, Color color) {
        super(alto, ancho, color);
    }

    @Override
    public void render() {
        System.out.println("FormaCirculo");
        color.dibujar();
    }

}
