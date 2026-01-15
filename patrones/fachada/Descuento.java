package patrones.fachada;

import java.util.List;

public class Descuento {
    public float calcularDescuento(List<Producto> productos) {
        if (productos.size() > 10) {
            float total = 0.f;

            for (Producto producto : productos) {
                total += producto.getPrecio() * producto.getCantidad();
            }

            return total * 0.1f;
        }else {
            return 0;
        }
    }
}
