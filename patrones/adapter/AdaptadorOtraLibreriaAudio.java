package patrones.adapter;

public class AdaptadorOtraLibreriaAudio implements Adaptador{
    private OtraLibreriaAudio libreria;
    
    public AdaptadorOtraLibreriaAudio() {
        libreria = new OtraLibreriaAudio();
    }

    @Override
    public void start() {
        libreria.iniciar();
    }

    @Override
    public void pause() {
        libreria.pausear();
    }

    @Override
    public void stop() {
        libreria.parar();
    }

}
