package org.example.corte2.semana2;

import dosw.bitacora.corte2.semana2.reto3.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReporteTest {

    @Test
    public void testBuilderContenido() {
        String contenido = new ReporteBuilder()
                .agregarInformacionGeneral("Empresa XYZ")
                .agregarEstadisticas("Ventas: 5000")
                .agregarTransacciones("100 transacciones")
                .agregarResumen("Balance positivo")
                .construir();
        assertTrue(contenido.contains("Empresa XYZ"));
        assertTrue(contenido.contains("Ventas: 5000"));
        assertTrue(contenido.contains("100 transacciones"));
        assertTrue(contenido.contains("Balance positivo"));
    }

    @Test
    public void testBuilderConFactory() {
        Reporte reporte = new ReporteBuilder()
                .agregarInformacionGeneral("Empresa XYZ")
                .agregarEstadisticas("Ventas: 5000")
                .construir(new PDFReporteFactory());
        assertNotNull(reporte);
        assertInstanceOf(PDFReporte.class, reporte);
        assertTrue(reporte.generar().startsWith("PDF:"));
    }

    @Test
    public void testFactoryCSV() {
        Reporte reporte = new CSVReporteFactory().crearReporte("datos");
        assertInstanceOf(CSVReporte.class, reporte);
        assertTrue(reporte.generar().startsWith("CSV:"));
    }

    @Test
    public void testFactoryJSON() {
        Reporte reporte = new JSONReporteFactory().crearReporte("datos");
        assertInstanceOf(JSONReporte.class, reporte);
        assertTrue(reporte.generar().startsWith("JSON:"));
    }

    @Test
    public void testDecoratorFirmaDigital() {
        Reporte reporte = new FirmaDigitalDecorator(
                new PDFReporteFactory().crearReporte("contenido")
        );
        assertTrue(reporte.generar().contains("[Firma Digital]"));
    }

    @Test
    public void testDecoratorMarcaAgua() {
        Reporte reporte = new MarcaAguaDecorator(
                new CSVReporteFactory().crearReporte("contenido")
        );
        assertTrue(reporte.generar().contains("[Marca de Agua]"));
    }

    @Test
    public void testDecoratorCompresion() {
        Reporte reporte = new CompresionDecorator(
                new JSONReporteFactory().crearReporte("contenido")
        );
        assertTrue(reporte.generar().contains("[Comprimido]"));
    }

    @Test
    public void testDecoradoresEncadenados() {
        Reporte reporte = new FirmaDigitalDecorator(
                new MarcaAguaDecorator(
                        new CompresionDecorator(
                                new PDFReporteFactory().crearReporte("contenido")
                        )
                )
        );
        String resultado = reporte.generar();
        assertTrue(resultado.contains("[Firma Digital]"));
        assertTrue(resultado.contains("[Marca de Agua]"));
        assertTrue(resultado.contains("[Comprimido]"));
    }
}