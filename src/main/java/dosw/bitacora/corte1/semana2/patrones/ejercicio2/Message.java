package dosw.bitacora.corte1.semana2.patrones.ejercicio2;

import java.time.LocalDateTime;

public class Message {

    private String text;
    private String author;
    private LocalDateTime date;

    public Message(String text, String author, LocalDateTime date){
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
