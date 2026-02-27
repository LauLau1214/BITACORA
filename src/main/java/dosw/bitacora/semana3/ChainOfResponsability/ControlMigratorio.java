package dosw.bitacora.semana3.ChainOfResponsability;

public interface ControlMigratorio {

    public void setSiguiente(ControlMigratorio siguiente);
    public void procesar(IngresoRequest request);
}
