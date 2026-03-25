package dosw.bitacora.corte1.semana2.patrones.ejercicio2;

import java.time.Instant;
import java.time.LocalDate;

public class AdapterPrinter implements SimplePrinter {

    private final DetailedPrinter DetailedPrinter;
    private DetailedPrinter detailPrinter;
    private String author;

    public AdapterPrinter(DetailedPrinter detailedPrinter, String author){
        this.DetailedPrinter = detailedPrinter;
        this.author = author;
    }

    @Override
    public void print(String message) {
        LocalDate localDate = null;
        Message m = new Message(message, author, localDate.now().atStartOfDay());
        DetailedPrinter.printDetailer(m);
    }
}
