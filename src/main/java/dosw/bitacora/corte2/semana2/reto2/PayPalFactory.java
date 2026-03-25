package dosw.bitacora.corte2.semana2.reto2;

public class PayPalFactory extends MetodoPagoFactory{

    @Override
    public MetodoPago crearMetodoPago() {
        return new PayPalAdapter(new PayPalAPI());
    }
}
