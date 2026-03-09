package dosw.bitacora.corte1.semana3.Composite.Item;

import java.util.ArrayList;
import java.util.List;

public class Caja implements Item {

    private String nombre;
    private List<Item> items = new ArrayList<>();

    public Caja(String nombre) {
        this.nombre = nombre;
    }

    public void add(Item item) {
        items.add(item);
    }

    @Override
    public double getPrice() {

        double total = 0;

        for (Item item : items) {
            total += item.getPrice();
        }

        return total;
    }
}
