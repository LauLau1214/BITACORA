package dosw.bitacora.semana3.FactoryMethod;

import dosw.bitacora.semana3.FactoryMethod.Porcessor.BankTransferProcessor;
import dosw.bitacora.semana3.FactoryMethod.Porcessor.CreditCardProcessor;
import dosw.bitacora.semana3.FactoryMethod.Porcessor.PayPalProcessor;
import dosw.bitacora.semana3.FactoryMethod.Porcessor.PaymentProcessor;

public class main {
    public static void main(String[] args) {
        PaymentProcessor processor;

        processor = new CreditCardProcessor();
        processor.processPayment(100);

        processor = new PayPalProcessor();
        processor.processPayment(250);

        processor = new BankTransferProcessor();
        processor.processPayment(500);

    }
}
