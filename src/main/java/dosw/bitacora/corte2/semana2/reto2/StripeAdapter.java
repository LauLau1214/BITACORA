package dosw.bitacora.corte2.semana2.reto2;

public class StripeAdapter implements MetodoPago {

    private final StripeAPI api;

    public StripeAdapter(StripeAPI api) {
        this.api = api;
    }

    @Override
    public void pagar(double monto) {
        api.makeCharge(monto);
    }
}
