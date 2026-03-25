package dosw.bitacora.corte2.semana2.reto2;

public class ProcesadorPago {
    private final MetodoPago metodoPago;
    private final Validador validador;

    public ProcesadorPago(MetodoPago metodoPago, Validador validador) {
        this.metodoPago = metodoPago;
        this.validador = validador;
    }

    public void procesar(double monto) {
        if (validador.validar(monto)) {
            metodoPago.pagar(monto);
        } else {
            System.out.println("Pago rechazado");
        }
    }
}
