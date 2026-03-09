package dosw.bitacora.corte1.semana2.patrones.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class History {

    private List<Memento> mementos = new ArrayList<>();

    public void add(Memento memento) {
        mementos.add(memento);
    }

    public Memento get(int index) {
        return mementos.get(index);
    }
}
