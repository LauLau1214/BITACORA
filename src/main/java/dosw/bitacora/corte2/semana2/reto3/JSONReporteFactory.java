package dosw.bitacora.corte2.semana2.reto3;

public class JSONReporteFactory extends ReporteFactory{

    public Reporte crearReporte(String contenido) {
        return new JSONReporte(contenido);
    }
}
