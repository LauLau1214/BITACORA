package dosw.bitacora.corte1.semana3.Iterator;

import java.util.Iterator;

public interface Aggregate<T> {
    Iterator<T> createIterator();
}
