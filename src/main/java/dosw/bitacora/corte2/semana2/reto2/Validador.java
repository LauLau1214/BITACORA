package dosw.bitacora.corte2.semana2.reto2;

public abstract class Validador {

    protected Validador siguiente;

    public void setSiguiente(Validador siguiente) {
        this.siguiente = siguiente;
    }

    public abstract boolean validar(double monto);
}