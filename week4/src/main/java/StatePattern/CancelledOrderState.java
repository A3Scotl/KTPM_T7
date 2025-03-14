package StatePattern;

public class CancelledOrderState implements OrderState {
    @Override
    public void handleOrder(Order order) {
        System.out.println("Hủy đơn hàng và hoàn tiền.");
    }
}
