package dosw.bitacora.semana2.patrones.ejercicio1;

public class MessageNotification implements notification {
    @Override
    public void send() {
        System.out.println("Enviando notificacion por mensaje de texto");
    }
}
