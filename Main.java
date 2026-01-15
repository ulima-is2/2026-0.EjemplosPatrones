import patrones.adapter.LibreriaAudio;
import patrones.factory_method.AplicacionOfimatica;
import patrones.factory_method.Documento;
import patrones.factory_method.Excel;
import patrones.factory_method.Powerpoint;

public class Main {
    public static void main(String[] args) {
        // Singleton
        Universidad u1 = Universidad.getInstance();
        Universidad u2 = Universidad.getInstance();
        //Universidad u3 = new Universidad();

        // Factory Method
        AplicacionOfimatica a = new Powerpoint();
        Documento d = a.crear();
        d.save();

        // Adapter
        var libreriaAudio = new LibreriaAudio();
        libreriaAudio.start();
        libreriaAudio.pause();
        libreriaAudio.stop();

    }
}
