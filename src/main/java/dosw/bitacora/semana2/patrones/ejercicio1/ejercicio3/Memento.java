package dosw.bitacora.semana2.patrones.ejercicio1.ejercicio3;

public class Memento {

    private final String state;

    public Memento(String state) {
        this.state = state;
    }

    protected String getState() {
        return state;
    }
}
