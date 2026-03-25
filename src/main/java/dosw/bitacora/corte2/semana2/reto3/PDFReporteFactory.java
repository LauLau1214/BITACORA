package dosw.bitacora.corte2.semana2.reto3;

public class PDFReporteFactory extends ReporteFactory{

    @Override
    public Reporte crearReporte(String contenido) {
        return new PDFReporte(contenido);
    }
}
