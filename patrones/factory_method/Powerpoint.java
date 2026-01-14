package patrones.factory_method;

public class Powerpoint extends AplicacionOfimatica {

    @Override
    public Documento crear() {
        return new Presentacion();
    }

}
