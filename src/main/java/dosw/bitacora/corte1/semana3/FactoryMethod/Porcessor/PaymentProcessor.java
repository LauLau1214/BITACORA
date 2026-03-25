package dosw.bitacora.corte1.semana3.FactoryMethod.Porcessor;

import dosw.bitacora.corte1.semana3.FactoryMethod.Payment.Payment;

public abstract class PaymentProcessor {

    //Metodo fabrica
    protected abstract Payment createPayment();

    //Metodo que usa la fabrica
    public void processPayment(double amount){
        Payment payment = createPayment();
        payment.pay(amount);
    }
}
