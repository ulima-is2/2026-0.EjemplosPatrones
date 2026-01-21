package patrones.observer;

public interface GameStateObserver {
    public void notify(
        int puntaje,
        int vidas,
        int nivel
    );
}
