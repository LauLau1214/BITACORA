package dosw.bitacora.semana3.Iterator;

import java.util.Iterator;

public class Tourist {

    public void exploreTour(Aggregate<Place> route){
        Iterator<Place> iterator = route.createIterator();

        while (iterator.hasNext()){
            Place p = iterator.next();
            System.out.println("Visiting" + p.getName());
        }
    }
}
