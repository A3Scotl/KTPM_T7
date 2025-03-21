package DecoratorPattern;

public class DiscountDecorator extends PaymentDecorator {
    private double discount;

    public DiscountDecorator(PaymentMethod decoratedPayment, double discount) {
        super(decoratedPayment);
        this.discount = discount;
    }

    @Override
    public void pay(double amount) {
        super.pay(amount - discount);
        System.out.println("Áp dụng mã giảm giá: " + discount);
    }
}

