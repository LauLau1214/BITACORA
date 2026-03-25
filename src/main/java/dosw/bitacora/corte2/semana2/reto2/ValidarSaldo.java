package dosw.bitacora.corte2.semana2.reto2;

public class ValidarSaldo extends Validador{

    @Override
    public boolean validar(double monto) {
        System.out.println("Validando saldo...");
        if (monto > 1000) {
            System.out.println("Saldo insuficiente");
            return false;
        }
        return siguiente == null || siguiente.validar(monto);
    }
}
