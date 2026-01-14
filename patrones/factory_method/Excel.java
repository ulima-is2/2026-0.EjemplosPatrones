package patrones.factory_method;

public class Excel extends AplicacionOfimatica{

    @Override
    public Documento crear() {
        return new HojaCalculo();
    }

}
