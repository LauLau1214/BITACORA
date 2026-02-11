package dosw.bitacora.semana2.patrones.ejercicio1.ejercicio2;

public class SimpleConsolePrinter {

    //impresora simple no se modifica
    public class SimpleConsolePrinter implements SimplePrinter {
        @Override
        public void print(String message) {
            System.out.println(message);
        }
    }
}
