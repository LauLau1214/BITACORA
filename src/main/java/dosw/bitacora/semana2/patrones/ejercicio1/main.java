package dosw.bitacora.semana2.patrones.ejercicio1;

//Ejercicio 1 Patrón Creacional (Factory Method)
//Contexto:
//Una aplicación necesita crear diferentes tipos de notificaciones según el canal de envío.
//        Enunciado:
//Diseñe una solución que permita crear distintos tipos de notificaciones:
//Notificación por correo electrónico
//Notificación por SMS
//Notificación por notificación push
//Todas las notificaciones deben poder enviarse, pero la forma de envío cambia según el tipo.
//El sistema debe permitir crear el tipo de notificación sin que el código principal dependa directamente de las clases concretas.
//Restricciones:
//Use una interfaz o clase abstracta para representar la notificación.
//Aplique polimorfismo para enviar la notificación.
//Evite crear instancias directamente desde el main.


public class main {
    public static void main(String[] args) {

        notification notification1 = NotificationFactory.create("email");
        notification notification2 = NotificationFactory.create("message");
        notification notification3 = NotificationFactory.create("push");

        if (notification1 != null) {
            notification1.send();
        }

        if (notification2 != null) {
            notification2.send();
        }

        if (notification3 != null) {
            notification3.send();
        }
    }
}
