package dosw.bitacora.corte1.semana3.Iterator;

import java.util.Iterator;

public class RomeIterator implements Iterator<Place> {

    private Place[] places;
    private int currentIndex = 0;

    public boolean hasNext() {
        return currentIndex < places.length;
    }

    public Place next() {
        return places[currentIndex++];
    }
}
