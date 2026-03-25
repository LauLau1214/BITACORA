package dosw.bitacora.corte2.semana2.reto3;

public class FirmaDigitalDecorator extends ReporteDecorator {

    public FirmaDigitalDecorator(Reporte reporte) {
        super(reporte);
    }

    @Override
    public String generar(){
        return reporte.generar() + "\n[Firma Digital]";
    }
}
