package dosw.bitacora.corte2.semana2.reto1;

public class PushNotification implements Notification {

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando PUSH: " + mensaje);
    }
}
