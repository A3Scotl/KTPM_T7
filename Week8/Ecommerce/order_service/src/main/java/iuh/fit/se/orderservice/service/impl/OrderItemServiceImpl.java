package iuh.fit.se.orderservice.service.impl;

import iuh.fit.se.orderservice.entity.OrderItems;
import iuh.fit.se.orderservice.repository.OrderItemRepository;
import iuh.fit.se.orderservice.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemServiceImpl implements OrderItemService {
    @Autowired
    private OrderItemRepository orderItemRepository;


    @Override
    public List<OrderItems> getAllOrderItemsByOrderId(Long orderId) {
        return orderItemRepository.findAllByOrderId(orderId);
    }

    @Override
    public OrderItems getOrderItemById(Long orderItemId) {
        return orderItemRepository.findById(orderItemId)
                .orElseThrow(() -> new RuntimeException("Order item not found with id: " + orderItemId));
    }

    @Override
    public OrderItems createOrderItem(OrderItems orderItem) {
        return orderItemRepository.save(orderItem);
    }

    @Override
    public OrderItems updateOrderItem(Long orderItemId, OrderItems orderItem) {
        return orderItemRepository.findById(orderItemId)
                .map(existingOrderItem -> {
                    existingOrderItem.setProductId(orderItem.getProductId());
                    existingOrderItem.setQuantity(orderItem.getQuantity());
                    existingOrderItem.setPrice(orderItem.getPrice());
                    return orderItemRepository.save(existingOrderItem);
                })
                .orElseThrow(() -> new RuntimeException("Order item not found with id: " + orderItemId));
    }

    @Override
    public void deleteOrderItem(Long orderItemId) {
        orderItemRepository.findById(orderItemId)
                .orElseThrow(() -> new RuntimeException("Order item not found with id: " + orderItemId));
        orderItemRepository.deleteById(orderItemId);
    }

    @Override
    public void deleteAllOrderItemsByOrderId(Long orderId) {
        List<OrderItems> orderItems = orderItemRepository.findAllByOrderId(orderId);
        if (orderItems.isEmpty()) {
            throw new RuntimeException("No order items found for order id: " + orderId);
        }
        orderItemRepository.deleteAll(orderItems);
    }

    @Override
    public List<OrderItems> getAllOrderItemsByProductId(Long productId) {
        return orderItemRepository.findAllByProductId(productId);
    }
}
