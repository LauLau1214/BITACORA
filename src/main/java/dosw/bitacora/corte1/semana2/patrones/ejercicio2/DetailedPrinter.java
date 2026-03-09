package dosw.bitacora.corte1.semana2.patrones.ejercicio2;

public class DetailedPrinter {

    public void printDetailer(Message message){
        System.out.println("Mensaje: " + message.getText());
        System.out.println("Author: " + message.getAuthor());
        System.out.println("Date: " + message.getDate());

    }
}
