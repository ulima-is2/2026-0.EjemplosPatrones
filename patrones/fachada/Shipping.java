package patrones.fachada;

import java.util.List;

public class Shipping {
    public float calcularCostoEnvio(List<Producto> productos) {
        return productos.size() * 5.f;
    }
}
