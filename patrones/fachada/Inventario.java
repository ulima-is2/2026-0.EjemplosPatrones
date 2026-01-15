package patrones.fachada;

import java.util.List;

public class Inventario {
    private List<Producto> productosDisponibles;

    public boolean hayDisponibilidad(String nombreProducto) {
        for (Producto producto : productosDisponibles) {
            if (producto.getNombre() == nombreProducto && producto.getCantidad() > 0) {
                return true;
            }
        }
        return false;
    }
}
