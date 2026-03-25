package dosw.bitacora.corte2.semana2.reto2;

public class TarjetaCreditoAdapter implements MetodoPago{

    private final TarjetaCreditoAPI api;

    public TarjetaCreditoAdapter(TarjetaCreditoAPI api) {
        this.api = api;
    }

    @Override
    public void pagar(double monto) {
        api.procesarPago(monto);
    }
}
