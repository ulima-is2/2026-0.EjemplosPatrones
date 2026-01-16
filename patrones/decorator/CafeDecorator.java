package patrones.decorator;

public abstract class CafeDecorator implements Cafe {
    protected Cafe aDecorar;

    public CafeDecorator(Cafe aDecorar) {
        this.aDecorar = aDecorar;
    }
}
