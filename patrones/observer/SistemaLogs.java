package patrones.observer;

public class SistemaLogs implements GameStateObserver{

    @Override
    public void notify(int puntaje, int vidas, int nivel) {
        System.out.println("Pintara un log");
    }

}
