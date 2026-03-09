package dosw.bitacora.corte1.semana3.Decorator.Barco;

public class BarcoBase implements Barco {

    @Override
    public String getDescripcion(){
        return "Barco base";
    }

    @Override
    public int poderAtaque(){
        return 50;
    }

    @Override
    public int defensa(){
        return 50;
    }
}
