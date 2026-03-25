package org.example.corte2.semana2;

import dosw.bitacora.corte2.semana2.reto1.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServicioNotificacionesTest {

    @Test
    void testSingleton() {
        ServicioNotificaciones s1 = ServicioNotificaciones.getInstancia();
        ServicioNotificaciones s2 = ServicioNotificaciones.getInstancia();

        assertSame(s1, s2);
    }

    @Test
    void testCambioEstrategia() {
        ServicioNotificaciones servicio = ServicioNotificaciones.getInstancia();

        servicio.setEstrategia(new EmailNotification());
        servicio.enviar("Test Email");

        servicio.setEstrategia(new SMSNotification());
        servicio.enviar("Test SMS");

        assertTrue(true); // solo valida que no falle
    }
}