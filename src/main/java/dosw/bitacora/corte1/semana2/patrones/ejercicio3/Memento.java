package dosw.bitacora.corte1.semana2.patrones.ejercicio3;

public class Memento {

    private final String state;

    public Memento(String state) {
        this.state = state;
    }

    protected String getState() {
        return state;
    }
}
