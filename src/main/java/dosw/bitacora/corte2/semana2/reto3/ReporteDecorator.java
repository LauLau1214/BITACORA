package dosw.bitacora.corte2.semana2.reto3;

public abstract class ReporteDecorator implements Reporte {

    protected final Reporte reporte;

    public ReporteDecorator(Reporte reporte) {
        this.reporte = reporte;
    }
}
