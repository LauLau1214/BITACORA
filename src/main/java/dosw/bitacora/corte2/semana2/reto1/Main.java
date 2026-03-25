package dosw.bitacora.corte2.semana2.reto1;

public class Main {

    public static void main(String[] args) {
        ServicioNotificaciones servicio = ServicioNotificaciones.getInstancia();

        servicio.setEstrategia(new EmailNotification());
        servicio.enviar("Por correo");

        servicio.setEstrategia(new SMSNotification());
        servicio.enviar("Por mensajes de texto");

        servicio.setEstrategia(new PushNotification());
        servicio.enviar("Por Push");
    }
}
