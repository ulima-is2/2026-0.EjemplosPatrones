import java.util.ArrayList;
import java.util.List;

import patrones.adapter.Adaptador;
import patrones.adapter.AdaptadorLibreriaAudio;
import patrones.adapter.AdaptadorOtraLibreriaAudio;
import patrones.adapter.LibreriaAudio;
import patrones.fachada.Descuento;
import patrones.fachada.Inventario;
import patrones.fachada.ManagerProductos;
import patrones.fachada.Producto;
import patrones.fachada.Shipping;
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
        iniciarMusica(new AdaptadorOtraLibreriaAudio());

        // Fachada y Singleton
        ManagerProductos manager = ManagerProductos.getInstance();
        manager.comprar("Peluche Ulises");


    }

    public static void iniciarMusica(Adaptador adaptador) {
        adaptador.start();

        adaptador.pause();

        adaptador.start();

        adaptador.stop();
    }
}
