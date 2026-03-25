package dosw.bitacora.corte2.semana2.reto3;

public class CSVReporteFactory extends ReporteFactory{

    @Override
    public Reporte crearReporte(String contenido) {
        return new CSVReporte(contenido);
    }
}
