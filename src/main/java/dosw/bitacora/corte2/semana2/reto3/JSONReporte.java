package dosw.bitacora.corte2.semana2.reto3;

public class JSONReporte implements Reporte{

    private final String contenido;

    public JSONReporte(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String generar() {
        return "JSON: " + contenido;
    }
}
