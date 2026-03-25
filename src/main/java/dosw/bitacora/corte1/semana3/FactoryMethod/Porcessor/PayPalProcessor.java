package dosw.bitacora.corte1.semana3.FactoryMethod.Porcessor;

import dosw.bitacora.corte1.semana3.FactoryMethod.Payment.Payment;
import dosw.bitacora.corte1.semana3.FactoryMethod.Payment.PaypalPayment;

public class PayPalProcessor extends PaymentProcessor {

    @Override
    protected Payment createPayment() {
        return new PaypalPayment();
    }
}
