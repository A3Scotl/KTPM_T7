package DecoratorPattern;

public class ProcessingFeeDecorator extends PaymentDecorator {
    public ProcessingFeeDecorator(PaymentMethod decoratedPayment) {
        super(decoratedPayment);
    }

    @Override
    public void pay(double amount) {
        super.pay(amount);
        System.out.println("Thêm phí xử lý: " + amount * 0.02);
    }
}
