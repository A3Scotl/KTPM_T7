package StatePattern;

public class ProcessingOrderState implements OrderState {
    @Override
    public void handleOrder(Order order) {
        System.out.println("Đóng gói và vận chuyển đơn hàng.");
        order.setState(new ShippedOrderState());
    }
}