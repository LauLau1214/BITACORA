package dosw.bitacora.corte2.semana2.reto2;

public class ValidadorFraude  extends Validador{

    @Override
    public boolean validar(double monto) {
        System.out.println("Validando fraude...");
        if (monto > 500) {
            System.out.println("Posible fraude detectado");
            return false;
        }
        return siguiente == null || siguiente.validar(monto);
    }
}
