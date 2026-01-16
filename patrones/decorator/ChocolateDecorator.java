package patrones.decorator;

public class ChocolateDecorator extends CafeDecorator{

    public ChocolateDecorator(Cafe aDecorar) {
        super(aDecorar);
    }
    
        @Override
    public float getCosto() {
        return aDecorar.getCosto() + 6.f;
    }

}
