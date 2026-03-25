package dosw.bitacora.corte2.semana2.reto1;

public class EmailNotification implements Notification {

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando EMAIL: " + mensaje);
    }
}
