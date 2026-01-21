package patrones.observer;

public class SistemaLogros implements GameStateObserver{

    @Override
    public void notify(int puntaje, int vidas, int nivel) {
        if (puntaje > 10) {
            System.out.println("Ganaste un badge");
        }
    }

}
