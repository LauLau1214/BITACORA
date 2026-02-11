package dosw.bitacora.semana2.patrones.ejercicio1;

public class NotificationFactory{

    public static notification create(String type){

        if (type.equalsIgnoreCase("email")){
            return new EmailNotification();
        }

        if (type.equalsIgnoreCase("message")){
            return new MessageNotification();
        }

        if (type.equalsIgnoreCase("push")){
            return new PushNotification();
        }

        return null;
    }
}
