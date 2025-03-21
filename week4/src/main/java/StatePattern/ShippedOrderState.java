package StatePattern;

public class ShippedOrderState implements OrderState {
    @Override
    public void handleOrder(Order order) {
        System.out.println("Cập nhật trạng thái đơn hàng: Đã giao.");
    }
}
