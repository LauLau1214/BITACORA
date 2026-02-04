import java.time.LocalDate;
import java.time.LocalDateTime;


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

public interface notification{
    void send();
}

public class EmailNotification implements notification{
    @Override
    public void send() {
        System.out.println("Enviando notificacion por correo electronico");
    }
}

public class MessageNotification implements notification{
    @Override
    public void send() {
        System.out.println("Enviando notificacion por mensaje de texto");
    }
}

public class PushNotification implements notification{
    @Override
    public void send() {
        System.out.println("Enviando notificacion por push");
    }
}

public class NotificationFactory{

    public static Notification create(String type){

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

//Ejercicio 2 – Patrón Estructural (Adapter)
//Contexto:
//En la aplicación existen dos clases que imprimen mensajes, pero lo hacen de manera distinta:
//Clase A (impresora simple):
//Imprime únicamente el texto del mensaje en consola.
//Clase B (impresora detallada):
//Imprime el mensaje incluyendo información adicional, como:
//El texto del mensaje
//El nombre del autor
//La fecha del mensaje
//El sistema fue diseñado para trabajar solo con la impresora simple, por lo que no puede usar directamente la impresora detallada.
//Enunciado:
//Diseñe una solución que permita que el sistema pueda utilizar ambos tipos de impresoras sin modificar ninguna de las clases existentes.
//Para lograrlo, debe crear un Adapter que permita que la impresora detallada se comporte como si fuera una impresora simple desde el punto de vista del sistema.
//Deben:
//Crear una clase que imprima solo el texto del mensaje.
//Crear otra clase que imprima el mensaje junto con autor y fecha.
//Definir una interfaz común que el sistema espera usar para imprimir mensajes.
//Implementar un Adapter que transforme la información necesaria y delegue la impresión a la impresora detallada.
//Restricciones:
//No modificar ninguna de las dos clases de impresión.
//Usar encapsulamiento para proteger los datos del mensaje.
//Aplicar polimorfismo para que el sistema pueda usar cualquiera de las impresoras sin saber cuál es.
//El código cliente debe depender únicamente de la interfaz.

public interface SimplePrinter{
    void print(String message);
}

//impresora simple no se modifica
public class SimpleConsolePrinter implements SimplePrinter{
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}

public class Mesage{

    private String text;
    private String author;
    private LocalDateTime date;

    public Mesage(String text, String author, LocalDateTime date){
        this.text = text;
        this.author = author;
        this.date = date;
    }

    public String getText(){
        return text;
    }

    public String getAuthor(){
        return author;
    }

    public LocalDateTime getDate(){
        return date;
    }
}

public class DetailedPrinter{

    public void printDetailer(Mesage mesage){
        System.out.println("Mensaje: " + mesage.getText());
        System.out.println("Author: " + mesage.getAuthor());
        System.out.println("Date: " + mesage.getDate());

    }
}

public class AdapterPrinter implements SimplePrinter{

    private DetailedPrinter detailPrinter;
    private String author;

    public AdapterPrinter(DetailedPrinter detailedPrinter, String author){
        this.author = author;
        this.detailedPrinter = detailedPrinter;
    }

    @Override
    public void print(String message) {
        Message m = new Message(message, author, localDate.now());
        detailedPrinter.printDetailed(m);
    }
}