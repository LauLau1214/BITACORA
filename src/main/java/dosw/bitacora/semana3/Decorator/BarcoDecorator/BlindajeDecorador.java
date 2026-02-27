package dosw.bitacora.semana3.Decorator.BarcoDecorator;

import dosw.bitacora.semana3.Decorator.Barco.Barco;

public class BlindajeDecorador extends BarcoBaseDecorator{

    public BlindajeDecorador(Barco barco){
        super(barco);
    }

    @Override
    public int defensa(){
        return barco.defensa() + 30;
    }

    @Override
    public String getDescripcion(){
        return barco.getDescripcion() + ", blindaje reforzado";
    }

}
