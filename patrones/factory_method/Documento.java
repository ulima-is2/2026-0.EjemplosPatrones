package patrones.factory_method;

public abstract class Documento {
    protected String nombre;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public abstract void open();
    public abstract void save();
    public abstract void close();
}
