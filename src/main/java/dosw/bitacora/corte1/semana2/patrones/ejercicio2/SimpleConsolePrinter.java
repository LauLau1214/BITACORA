package dosw.bitacora.corte1.semana2.patrones.ejercicio2;

public class SimpleConsolePrinter {

    //impresora simple no se modifica
    public class SimpleConsolePrinter implements SimplePrinter {
        @Override
        public void print(String message) {
            System.out.println(message);
        }
    }
}
