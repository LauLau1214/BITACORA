package dosw.bitacora.corte2.semana2.reto2;

public class TarjetaCreditoFactory extends MetodoPagoFactory {

    @Override
    public MetodoPago crearMetodoPago() {
        return new TarjetaCreditoAdapter(new TarjetaCreditoAPI());
    }
}
