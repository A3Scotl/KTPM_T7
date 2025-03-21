package DecoratorPattern;

public class PaymentSystem {
    public static void main(String[] args) {
        PaymentMethod payment1 = new CreditCardPayment();
        payment1.pay(100);

        PaymentMethod payment2 = new ProcessingFeeDecorator(new PayPalPayment());
        payment2.pay(200);

        PaymentMethod payment3 = new DiscountDecorator(new CreditCardPayment(), 10);
        payment3.pay(100);
    }
}
