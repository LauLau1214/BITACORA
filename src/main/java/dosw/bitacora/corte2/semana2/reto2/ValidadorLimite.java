package dosw.bitacora.corte2.semana2.reto2;

public class ValidadorLimite extends Validador{

    @Override
    public boolean validar(double monto) {
        System.out.println("Validando límite...");
        if (monto > 800) {
            System.out.println("Límite de transacción excedido");
            return false;
        }
        return siguiente == null || siguiente.validar(monto);
    }
}
