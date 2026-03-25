package dosw.bitacora.corte2.semana2.reto3;

public class MarcaAguaDecorator extends ReporteDecorator{

    public MarcaAguaDecorator(Reporte reporte) {
        super(reporte);
    }

    @Override
    public String generar() {
        return reporte.generar() + "\n[Marca de Agua]";
    }
}
