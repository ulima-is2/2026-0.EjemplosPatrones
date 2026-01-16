import java.util.ArrayList;
import java.util.List;

import patrones.adapter.Adaptador;
import patrones.adapter.AdaptadorLibreriaAudio;
import patrones.adapter.AdaptadorOtraLibreriaAudio;
import patrones.adapter.LibreriaAudio;
import patrones.decorator.Cafe;
import patrones.decorator.CafeAmericano;
import patrones.decorator.ChocolateDecorator;
import patrones.decorator.LecheDecorator;
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
        //ManagerProductos manager = ManagerProductos.getInstance();
        //manager.comprar("Peluche Ulises");

        // Decorator
        Cafe cafe = new CafeAmericano();
        System.out.println("Cafe Americano: " + cafe.getCosto());

        System.out.println("Cafe Americano con Leche: " + new LecheDecorator(cafe).getCosto());
        System.out.println("Cafe Americano con Chocolate: " + new ChocolateDecorator(cafe).getCosto());

        float costaMoccachino = new LecheDecorator(new ChocolateDecorator(cafe)).getCosto();
        System.out.println("Costo Moccachino: " + costaMoccachino);

    }

    public static void iniciarMusica(Adaptador adaptador) {
        adaptador.start();

        adaptador.pause();

        adaptador.start();

        adaptador.stop();
    }
}
