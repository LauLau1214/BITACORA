package dosw.bitacora.semana3.Composite.Item;

public class Producto implements Item {

    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public double getPrice() {
        return precio;
    }
}
