package iuh.fit.se.orderservice.service;

import iuh.fit.se.orderservice.entity.OrderItems;

import java.util.List;

public interface OrderItemService {
    List<OrderItems> getAllOrderItemsByOrderId(Long orderId);
    OrderItems getOrderItemById(Long orderItemId);
    OrderItems createOrderItem(OrderItems orderItem);
    OrderItems updateOrderItem(Long orderItemId, OrderItems orderItem);
    void deleteOrderItem(Long orderItemId);
    void deleteAllOrderItemsByOrderId(Long orderId);
    List<OrderItems> getAllOrderItemsByProductId(Long productId);

}
