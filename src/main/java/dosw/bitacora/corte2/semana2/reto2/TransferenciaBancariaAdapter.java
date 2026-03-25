package dosw.bitacora.corte2.semana2.reto2;

public class TransferenciaBancariaAdapter implements MetodoPago{

    private final TransferenciaBancariaAPI api;

    public TransferenciaBancariaAdapter(TransferenciaBancariaAPI api) {
        this.api = api;
    }

    @Override
    public void pagar(double monto) {
        api.realizarTransferencia(monto);
    }
}
