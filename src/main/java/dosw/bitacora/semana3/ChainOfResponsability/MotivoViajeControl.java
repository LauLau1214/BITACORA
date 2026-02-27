package dosw.bitacora.semana3.ChainOfResponsability;

public class MotivoViajeControl extends ControlMigratorioHandler{

    @Override
    public void procesar(IngresoRequest request){
        if (!request.isMotivoValido()) {
            System.out.println("Ingreso rechazado: Motivo inválido");
            return;
        }

        if (siguiente != null) {
            siguiente.procesar(request);
        }
    }
}
