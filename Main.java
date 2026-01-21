import java.util.ArrayList;
import java.util.List;

import patrones.adapter.Adaptador;
import patrones.adapter.AdaptadorLibreriaAudio;
import patrones.adapter.AdaptadorOtraLibreriaAudio;
import patrones.adapter.LibreriaAudio;
import patrones.bridge.ColorRojo;
import patrones.bridge.ColorVerde;
import patrones.bridge.FormaCirculo;
import patrones.bridge.FormaCuadrado;
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
import patrones.observer.GameState;
import patrones.observer.HUD;
import patrones.observer.SistemaLogros;

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


        //Bridge
        var formaCirculoRojo = new FormaCirculo(30, 20, new ColorRojo());
        var formaCuadradoVerde = new FormaCuadrado(20, 20, new ColorVerde());

        formaCirculoRojo.render();
        formaCuadradoVerde.render();

        // Observer
        
        GameState.getInstance().addObserver(new HUD());
        GameState.getInstance().addObserver(new SistemaLogros());

        GameState.getInstance().setNivel(9);
        GameState.getInstance().setPuntaje(11);

    }

    public static void iniciarMusica(Adaptador adaptador) {
        adaptador.start();

        adaptador.pause();

        adaptador.start();

        adaptador.stop();
    }
}
