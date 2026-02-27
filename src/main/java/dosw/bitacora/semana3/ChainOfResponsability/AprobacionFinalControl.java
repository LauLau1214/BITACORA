package dosw.bitacora.semana3.ChainOfResponsability;

public class AprobacionFinalControl extends ControlMigratorioHandler{

    @Override
    public void procesar(IngresoRequest request){

        request.setAprobado(true);
        System.out.println("Ingreso aprobado. Bienvenido a Estados Unidos.");
    }
}
