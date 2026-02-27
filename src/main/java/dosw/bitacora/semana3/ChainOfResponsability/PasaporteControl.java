package dosw.bitacora.semana3.ChainOfResponsability;

public class PasaporteControl extends ControlMigratorioHandler{

    @Override
    public void procesar(IngresoRequest request){
        if (!request.isPasaporteValido()) {
            System.out.println("Ingreso rechazado: Pasaporte inválido");
            return;
        }

        if (siguiente != null) {
            siguiente.procesar(request);
        }
    }
}
