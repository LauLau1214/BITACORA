package org.example.corte2.semana2;

import dosw.bitacora.corte2.semana2.reto2.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProcesadorPagoTest {

    private Validador construirCadena() {
        Validador saldo = new ValidarSaldo();
        Validador fraude = new ValidadorFraude();
        Validador limite = new ValidadorLimite();
        saldo.setSiguiente(fraude);
        fraude.setSiguiente(limite);
        return saldo;
    }

    @Test
    public void testPagoAprobadoPayPal() {
        MetodoPago metodo = new PayPalFactory().crearMetodoPago();
        ProcesadorPago procesador = new ProcesadorPago(metodo, construirCadena());
        assertDoesNotThrow(() -> procesador.procesar(100));
    }

    @Test
    public void testPagoRechazadoPorSaldo() {
        MetodoPago metodo = new StripeFactory().crearMetodoPago();
        ProcesadorPago procesador = new ProcesadorPago(metodo, construirCadena());
        assertDoesNotThrow(() -> procesador.procesar(1500));
    }

    @Test
    public void testPagoRechazadoPorFraude() {
        MetodoPago metodo = new TarjetaCreditoFactory().crearMetodoPago();
        ProcesadorPago procesador = new ProcesadorPago(metodo, construirCadena());
        assertDoesNotThrow(() -> procesador.procesar(600));
    }

    @Test
    public void testPagoRechazadoPorLimite() {
        MetodoPago metodo = new TransferenciaBancariaFactory().crearMetodoPago();
        ProcesadorPago procesador = new ProcesadorPago(metodo, construirCadena());
        assertDoesNotThrow(() -> procesador.procesar(850));
    }

    @Test
    public void testFactoryPayPal() {
        MetodoPago metodo = new PayPalFactory().crearMetodoPago();
        assertNotNull(metodo);
        assertInstanceOf(PayPalAdapter.class, metodo);
    }

    @Test
    public void testFactoryStripe() {
        MetodoPago metodo = new StripeFactory().crearMetodoPago();
        assertNotNull(metodo);
        assertInstanceOf(StripeAdapter.class, metodo);
    }
}