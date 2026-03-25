package dosw.bitacora.corte2.semana2.reto2;

public class TransferenciaBancariaFactory extends MetodoPagoFactory {

    @Override
    public MetodoPago crearMetodoPago() {
        return new TransferenciaBancariaAdapter(new TransferenciaBancariaAPI());
    }
}
