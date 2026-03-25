package dosw.bitacora.corte2.semana2.reto2;

public class PayPalAdapter implements MetodoPago {

    private final PayPalAPI api;

    public PayPalAdapter(PayPalAPI api) {
        this.api = api;
    }

    @Override
    public void pagar(double monto) {
        api.payWithPaypal(monto);
    }
}
