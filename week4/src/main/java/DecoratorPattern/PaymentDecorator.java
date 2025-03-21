package DecoratorPattern;

public abstract class PaymentDecorator implements PaymentMethod {
    protected PaymentMethod decoratedPayment;

    public PaymentDecorator(PaymentMethod decoratedPayment) {
        this.decoratedPayment = decoratedPayment;
    }

    @Override
    public void pay(double amount) {
        decoratedPayment.pay(amount);
    }
}