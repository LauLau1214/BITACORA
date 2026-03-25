package dosw.bitacora.corte2.semana2.reto3;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Reporte PDF con Firma Digital ===");
        Reporte pdf = new ReporteBuilder()
                .agregarInformacionGeneral("Empresa XYZ")
                .agregarEstadisticas("Ventas: 5000")
                .agregarTransacciones("100 transacciones")
                .agregarResumen("Balance positivo")
                .construir(new PDFReporteFactory());
        Reporte pdfFirmado = new FirmaDigitalDecorator(pdf);
        System.out.println(pdfFirmado.generar());

        System.out.println("\n=== Reporte CSV con Marca de Agua ===");
        Reporte csv = new ReporteBuilder()
                .agregarInformacionGeneral("Reporte mensual")
                .agregarEstadisticas("Usuarios: 200")
                .construir(new CSVReporteFactory());
        Reporte csvMarca = new MarcaAguaDecorator(csv);
        System.out.println(csvMarca.generar());

        System.out.println("\n=== Reporte JSON con todos los decoradores ===");
        Reporte json = new ReporteBuilder()
                .agregarInformacionGeneral("Reporte anual")
                .agregarEstadisticas("Ganancias: 1M")
                .agregarTransacciones("5000 transacciones")
                .agregarResumen("Año exitoso")
                .construir(new JSONReporteFactory());
        Reporte jsonCompleto = new FirmaDigitalDecorator(
                new MarcaAguaDecorator(
                        new CompresionDecorator(json)
                )
        );
        System.out.println(jsonCompleto.generar());
    }
}