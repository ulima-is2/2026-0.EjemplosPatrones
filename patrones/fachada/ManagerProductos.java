package patrones.fachada;

import java.util.ArrayList;
import java.util.List;

//Fachada
// Singleton
public class ManagerProductos {
    private static ManagerProductos instancia = null;

    public static ManagerProductos getInstance() {
        if (instancia == null) {
            instancia = new ManagerProductos();
        }
        return instancia;
    }

    List<Producto> listaAComprar = new ArrayList<>();

    private ManagerProductos() {}

    public void comprar(String producto) {
        Inventario inv = new Inventario();
        Descuento desc = new Descuento();
        Shipping ship = new Shipping();
        boolean hay = inv.hayDisponibilidad(producto);
        if (hay) {
            listaAComprar.add(
                new Producto(
                    "Peluche Ulises", 
                    2, 
                    20.f
                )
            );

            float descuento = desc.calcularDescuento(listaAComprar);
            float shipping = ship.calcularCostoEnvio(listaAComprar);
        }
    }
    
}
