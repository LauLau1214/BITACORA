package dosw.bitacora.corte2.semana2.reto2;

public class Main {
    public static void main(String[] args) {

        Validador saldo = new ValidarSaldo();
        Validador fraude = new ValidadorFraude();
        Validador limite = new ValidadorLimite();
        saldo.setSiguiente(fraude);
        fraude.setSiguiente(limite);

        System.out.println("=== Pago con PayPal ===");
        MetodoPago paypal = new PayPalFactory().crearMetodoPago();
        new ProcesadorPago(paypal, saldo).procesar(100);

        System.out.println("\n=== Pago con Stripe ===");
        MetodoPago stripe = new StripeFactory().crearMetodoPago();
        new ProcesadorPago(stripe, saldo).procesar(600);

        System.out.println("\n=== Pago con Tarjeta de Crédito ===");
        MetodoPago tarjeta = new TarjetaCreditoFactory().crearMetodoPago();
        new ProcesadorPago(tarjeta, saldo).procesar(1500);

        System.out.println("\n=== Pago con Transferencia Bancaria ===");
        MetodoPago transferencia = new TransferenciaBancariaFactory().crearMetodoPago();
        new ProcesadorPago(transferencia, saldo).procesar(850);
    }
}