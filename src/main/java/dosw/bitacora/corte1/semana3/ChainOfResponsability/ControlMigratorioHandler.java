package dosw.bitacora.corte1.semana3.ChainOfResponsability;

public abstract class ControlMigratorioHandler implements ControlMigratorio {

    protected ControlMigratorio siguiente;

    @Override
    public void setSiguiente(ControlMigratorio siguiente){
        this.siguiente = siguiente;
    }
}
