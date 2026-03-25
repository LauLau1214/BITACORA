package dosw.bitacora.corte2.semana2.reto3;

public class PDFReporte implements Reporte {

    private final String contenido;
    public PDFReporte(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String generar() {
        return "PDF: " + contenido;
    }
}
