package dosw.bitacora.semana3.ChainOfResponsability;

public class AntecedentesControl extends ControlMigratorioHandler{

    @Override
    public void procesar(IngresoRequest request){
        if (!request.isAntecedentesLimpios()) {
            System.out.println("Ingreso rechazado: Antecedentes negativos");
            return;
        }

        if (siguiente != null) {
            siguiente.procesar(request);
        }

    }
}
