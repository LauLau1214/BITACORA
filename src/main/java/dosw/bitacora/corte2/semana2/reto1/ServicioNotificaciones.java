package dosw.bitacora.corte2.semana2.reto1;

public class ServicioNotificaciones {

    private static ServicioNotificaciones instancia;
    private Notification estrategia;

    private ServicioNotificaciones(){}

    public static ServicioNotificaciones getInstancia(){
        if(instancia == null){
            instancia = new ServicioNotificaciones();
        }
        return instancia;
    }

    public void setEstrategia(Notification estrategia){
        this.estrategia = estrategia;
    }

    public void enviar(String mensaje){
        if(estrategia != null){
            System.out.println("No hay estrategia definida");
            return;
        }
        estrategia.enviar(mensaje);
    }
}
