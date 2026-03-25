package dosw.bitacora.corte2.semana2.reto3;

public class CompresionDecorator extends ReporteDecorator{

    public CompresionDecorator(Reporte reporte) {
        super(reporte);
    }

    @Override
    public String generar() {
        return "[Comprimido]\n" + reporte.generar();
    }
}

