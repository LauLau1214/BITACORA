package dosw.bitacora.corte2.semana2.reto2;

public class StripeFactory extends MetodoPagoFactory{

    @Override
    public MetodoPago crearMetodoPago() {
        return new StripeAdapter(new StripeAPI());
    }
}
