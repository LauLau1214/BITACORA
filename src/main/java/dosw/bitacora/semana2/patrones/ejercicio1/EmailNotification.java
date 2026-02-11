package dosw.bitacora.semana2.patrones.ejercicio1;

public class EmailNotification implements notification {
    @Override
    public void send() {
        System.out.println("Enviando notificacion por correo electronico");
    }
}
