package dosw.bitacora.semana3.Decorator.BarcoDecorator;

import dosw.bitacora.semana3.Decorator.Barco.Barco;

public class MisilesDecorador extends BarcoBaseDecorator{

    public MisilesDecorador(Barco barco) {
        super(barco);
    }

    @Override
    public String getDescripcion() {
        return barco.getDescripcion() + ", misiles";
    }

    @Override
    public int poderAtaque(){
        return barco.poderAtaque() + 40;
    }

}
