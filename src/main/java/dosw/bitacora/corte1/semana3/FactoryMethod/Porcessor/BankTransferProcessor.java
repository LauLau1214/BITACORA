package dosw.bitacora.corte1.semana3.FactoryMethod.Porcessor;

import dosw.bitacora.semana3.FactoryMethod.Payment.BankTransferPayment;
import dosw.bitacora.semana3.FactoryMethod.Payment.Payment;

public class BankTransferProcessor extends PaymentProcessor {

    @Override
    protected Payment createPayment() {
        return new BankTransferPayment();
    }
}
