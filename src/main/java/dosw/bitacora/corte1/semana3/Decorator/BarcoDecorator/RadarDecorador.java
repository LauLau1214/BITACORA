package dosw.bitacora.corte1.semana3.Decorator.BarcoDecorator;

import dosw.bitacora.corte1.semana3.Decorator.Barco.Barco;

public class RadarDecorador extends BarcoBaseDecorator{

    public RadarDecorador(Barco barco){
        super(barco);
    }

    @Override
    public String getDescripcion(){
        return barco.getDescripcion() + ", radar avanzado";
    }

    @Override
    public int poderAtaque(){
        return barco.poderAtaque() + 10;
    }
}

