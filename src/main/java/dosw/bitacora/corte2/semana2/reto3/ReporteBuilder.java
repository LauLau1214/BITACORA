package dosw.bitacora.corte2.semana2.reto3;

public class ReporteBuilder {

    private final StringBuilder contenido = new StringBuilder();

    public ReporteBuilder agregarInformacionGeneral(String info) {
        contenido.append("Info: ").append(info).append("\n");
        return this;
    }

    public ReporteBuilder agregarEstadisticas(String stad){
        contenido.append("Estadisticas: ").append(stad).append("\n");
        return this;
    }

    public ReporteBuilder agregarTransacciones(String trans){
        contenido.append("Transacciones: ").append(trans).append("\n");
        return this;
    }

    public ReporteBuilder agregarResumen(String resumen){
        contenido.append("Resumen: ").append(resumen).append("\n");
        return this;
    }

    public String construir(){
        return contenido.toString();
    }

    public Reporte construir(ReporteFactory factory){
        return factory.crearReporte(contenido.toString());
    }
}

