package dosw.bitacora.semana2.patrones.ejercicio1.ejercicio2;

public class AdapterPrinter implements SimplePrinter {

    private DetailedPrinter detailPrinter;
    private String author;

    public AdapterPrinter(DetailedPrinter detailedPrinter, String author){
        this.detailedPrinter = detailedPrinter;
        this.author = author;
    }

    @Override
    public void print(String message) {
        Message m = new Message(message, author, localDate.now());
        DetailedPrinter.printDetailed(m);
    }
}
