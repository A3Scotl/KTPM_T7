package iuh.fit.se.orderservice.service.impl;

import iuh.fit.se.orderservice.entity.Orders;
import iuh.fit.se.orderservice.repository.OrderRepository;
import iuh.fit.se.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Orders> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Orders getOrderById(Long orderId) {
        return orderRepository.findById(orderId)
                .orElseThrow(() -> new RuntimeException("Order not found with id: " + orderId));
    }

    @Override
    public Orders createOrder(Orders order) {
        return orderRepository.save(order);
    }

    @Override
    public Orders updateOrder(Long orderId, Orders order) {
        return orderRepository.findById(orderId)
                .map(existingOrder -> {
                    existingOrder.setCustomerId(order.getCustomerId());
                    existingOrder.setStatus(order.getStatus());
                    existingOrder.setTotalPrice(order.getTotalPrice());
                    return orderRepository.save(existingOrder);
                })
                .orElseThrow(() -> new RuntimeException("Order not found with id: " + orderId));
    }

    @Override
    public void deleteOrder(Long orderId) {
        orderRepository.findById(orderId)
                .orElseThrow(() -> new RuntimeException("Order not found with id: " + orderId));
        orderRepository.deleteById(orderId);
    }

    @Override
    public List<Orders> getAllOrdersByCustomerId(Long customerId) {
        return orderRepository.findAllByCustomerId(customerId);
    }

    @Override
    public List<Orders> getAllOrdersByStatus(String status) {
        return orderRepository.findAllByStatus(status);
    }
}
