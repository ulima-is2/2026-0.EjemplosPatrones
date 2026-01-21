package patrones.observer;

public class HUD implements GameStateObserver{

    @Override
    public void notify(int puntaje, int vidas, int nivel) {
        System.out.println(
            String.format(
                "Puntaje: %d\nVida:%d\nNivel:%d",
                puntaje,
                vidas,
                nivel
            )
        );
    }

}
