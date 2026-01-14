package patrones.factory_method;

public class Presentacion extends Documento{

    @Override
    public void open() {
        System.out.println("Se abrira presentacion");
    }

    @Override
    public void save() {
        System.out.println("Se guardara presentacion");
    }

    @Override
    public void close() {
        System.out.println("Se cerrara presentacion");
    }

}
