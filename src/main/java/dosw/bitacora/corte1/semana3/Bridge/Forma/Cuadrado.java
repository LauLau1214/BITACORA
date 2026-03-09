package dosw.bitacora.corte1.semana3.Bridge.Forma;

import dosw.bitacora.semana3.Bridge.Color.Color;

public class Cuadrado extends Forma{

    public Cuadrado(Color color) {
        super(color);
    }

    @Override
    void dibujar() {
        System.out.print("Dibujando cuadrado con ");
        color.aplicarColor();
    }

}
