package patrones.bridge;

public class FormaCuadrado extends Forma{
    public FormaCuadrado(int alto, int ancho, Color color) {
        super(alto, ancho, color);
    }

    @Override
    public void render() {
        System.out.println("FormaCuadrado");
        color.dibujar();
    }

}
