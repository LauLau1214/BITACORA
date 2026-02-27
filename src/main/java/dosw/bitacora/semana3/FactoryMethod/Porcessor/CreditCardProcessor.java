package dosw.bitacora.semana3.FactoryMethod.Porcessor;

import dosw.bitacora.semana3.FactoryMethod.Payment.CreditCardPayment;
import dosw.bitacora.semana3.FactoryMethod.Payment.Payment;

public class CreditCardProcessor extends PaymentProcessor {

    @Override
    protected Payment createPayment() {
        return new CreditCardPayment();
    }
}
