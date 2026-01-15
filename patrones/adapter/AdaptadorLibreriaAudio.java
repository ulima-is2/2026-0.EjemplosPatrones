package patrones.adapter;

public class AdaptadorLibreriaAudio implements Adaptador{
    private LibreriaAudio libreria;

    public AdaptadorLibreriaAudio() {
        libreria = new LibreriaAudio();
    }

    @Override
    public void start() {
        
        libreria.start();
    }

    @Override
    public void pause() {
        libreria.pause();
    }

    @Override
    public void stop() {
        libreria.stop();
    }

}
