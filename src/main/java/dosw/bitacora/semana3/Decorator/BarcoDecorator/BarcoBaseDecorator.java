package dosw.bitacora.semana3.Decorator.BarcoDecorator;

import dosw.bitacora.semana3.Decorator.Barco.Barco;

public abstract class BarcoBaseDecorator implements Barco {

    protected Barco barco;

    public BarcoBaseDecorator(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String getDescripcion() {
        return barco.getDescripcion();
    }

    @Override
    public int defensa(){
        return barco.defensa();
    }

    @Override
    public int poderAtaque(){
        return barco.poderAtaque();
    }




}
