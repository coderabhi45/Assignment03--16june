package Package10;

public class PaymentSuccessful {
    public static void main(String[] args) {


        Payment payment;

        payment = new CreditCardPayment();
        payment.pay(1500.00);

        payment = new Payment();
        payment.pay(800.00);

        payment = new Payment();
        payment.pay(500.00);
    }
}
