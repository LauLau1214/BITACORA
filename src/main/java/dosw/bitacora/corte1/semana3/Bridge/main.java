package dosw.bitacora.corte1.semana3.Bridge;

import dosw.bitacora.semana3.Bridge.Forma.*;
import dosw.bitacora.semana3.Bridge.Color.*;

public class main {

    public static void main(String[] args) {

        Forma circuloRojo = new Circulo(new Rojo());
        Forma cuadradoRojo = new Cuadrado(new Rojo());

        Forma circuloAzul = new Circulo(new Azul());
        Forma cuadradoAzul = new Cuadrado(new Azul());

        circuloRojo.dibujar();
        cuadradoRojo.dibujar();
        circuloAzul.dibujar();
        cuadradoAzul.dibujar();
    }

}
