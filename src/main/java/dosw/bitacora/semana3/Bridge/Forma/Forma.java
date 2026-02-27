package dosw.bitacora.semana3.Bridge.Forma;

import dosw.bitacora.semana3.Bridge.Color.Color;

public abstract class Forma {

    protected Color color;

    public Forma(Color color) {
        this.color = color;
    }

    public abstract void dibujar();
}
