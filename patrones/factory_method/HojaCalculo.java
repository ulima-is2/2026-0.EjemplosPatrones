package patrones.factory_method;

public class HojaCalculo extends Documento{

    @Override
    public void open() {
        System.out.println("Se abrira hoja de calculo");
    }

    @Override
    public void save() {
        System.out.println("Se guardara hoja de calculo");
    }

    @Override
    public void close() {
        System.out.println("Se cerrar hoja de calculo");
    }

}
