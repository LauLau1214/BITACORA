package dosw.bitacora.corte2.semana2.reto3;

public class CSVReporte implements Reporte {

    private final String contenido;

    public CSVReporte(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String generar() {
        return "CSV: " + contenido;
    }
}
