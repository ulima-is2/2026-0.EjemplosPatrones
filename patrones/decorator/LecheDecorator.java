package patrones.decorator;

public class LecheDecorator extends CafeDecorator{

    public LecheDecorator(Cafe aDecorar) {
        super(aDecorar);
    }
    
    @Override
    public float getCosto() {
        float costoCafeBase = aDecorar.getCosto();
        return costoCafeBase + 5.f;
    }

}
