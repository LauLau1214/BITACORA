package dosw.bitacora.corte1.semana3.Decorator.BarcoDecorator;

import dosw.bitacora.semana3.Decorator.Barco.Barco;

public class AntiTorpedosDecorador extends BarcoBaseDecorator {

    public AntiTorpedosDecorador(Barco barco) {
        super(barco);
    }

    @Override
    public String getDescripcion() {
        return barco.getDescripcion() + ", sistema antitorpedos";
    }

    @Override
    public int poderAtaque(){
        return barco.poderAtaque() + 20;
    }
}
