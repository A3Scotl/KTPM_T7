package StatePattern;

public class NewOrderState implements OrderState {
    @Override
    public void handleOrder(Order order) {
        System.out.println("Kiểm tra thông tin đơn hàng.");
        order.setState(new ProcessingOrderState());
    }
}
