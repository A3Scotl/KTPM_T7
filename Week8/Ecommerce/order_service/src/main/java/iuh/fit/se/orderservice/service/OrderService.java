package iuh.fit.se.orderservice.service;

import iuh.fit.se.orderservice.entity.Orders;

import java.util.List;

public interface OrderService {
    List<Orders> getAllOrders();
    Orders getOrderById(Long orderId);
    Orders createOrder(Orders order);
    Orders updateOrder(Long orderId, Orders order);
    void deleteOrder(Long orderId);
    List<Orders> getAllOrdersByCustomerId(Long customerId);
    List<Orders> getAllOrdersByStatus(String status);
}
