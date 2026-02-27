package dosw.bitacora.semana3.FactoryMethod.Payment;

public class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Pago con tarjeta de credito por $" + amount);
    }

}
