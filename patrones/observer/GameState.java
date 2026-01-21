package patrones.observer;

import java.util.ArrayList;
import java.util.List;

// Singleton
public class GameState {
    private static GameState instance = null;

    public static GameState getInstance() {
        if (instance == null) {
            instance = new GameState();
        }
        return instance;
    }

    private int nivel;
    private int puntaje;
    private int vidas;
    private List<GameStateObserver> observadores;

    private GameState() {}

    public void addObserver(GameStateObserver observer) {
        if (observadores == null) {
            observadores = new ArrayList<>(); // Lazy init
        }
        observadores.add(observer);
    }

    private void update() {
        if (observadores == null) return;

        for (GameStateObserver obs : observadores) {
            obs.notify(puntaje, vidas, nivel);
        }
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
        update();
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
        update();
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
        update();
    }
}
