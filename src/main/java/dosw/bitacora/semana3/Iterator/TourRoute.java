package dosw.bitacora.semana3.Iterator;

import java.util.Iterator;

public class TourRoute implements Aggregate<Place> {

    private final Place[] places;

    public TourRoute() {
        places = new Place[] {
                new Place("Colosseum"),
                new Place("Roman Forum"),
                new Place("Trevi Fountain"),
                new Place("Pantheon"),
                new Place("Spanish Steps")
        };

    }

    public Iterator<Place> createIterator() {
        return new RomeIterator();
    }
}
