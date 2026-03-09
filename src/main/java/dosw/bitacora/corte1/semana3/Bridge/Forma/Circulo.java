package dosw.bitacora.corte1.semana3.Bridge.Forma;

import dosw.bitacora.semana3.Bridge.Color.Color;

public class Circulo extends Forma {

    public Circulo(Color color) {
        super(color);
    }

    @Override
    void dibujar() {
        System.out.print("Dibujando círculo con ");
        color.aplicarColor();
    }
}
