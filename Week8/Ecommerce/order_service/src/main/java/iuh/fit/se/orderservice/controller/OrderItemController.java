package iuh.fit.se.orderservice.controller;

import iuh.fit.se.orderservice.entity.OrderItems;
import iuh.fit.se.orderservice.service.OrderItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/order-items")
public class OrderItemController {
    @Autowired
    private OrderItemService orderItemService;

    @GetMapping
    public ResponseEntity<List<OrderItems>> getAllOrderItemsByOrderId(@PathVariable Long orderId) {
        List<OrderItems> orderItems = orderItemService.getAllOrderItemsByOrderId(orderId);
        return ResponseEntity.ok(orderItems);
    }

    @GetMapping("/{orderItemId}")
    public ResponseEntity<OrderItems> getOrderItemById(@PathVariable Long orderItemId) {
        OrderItems orderItem = orderItemService.getOrderItemById(orderItemId);
        return ResponseEntity.ok(orderItem);
    }

    @GetMapping("/product/{productId}")
    public ResponseEntity<List<OrderItems>> getAllOrderItemsByProductId(@PathVariable Long productId) {
        List<OrderItems> orderItems = orderItemService.getAllOrderItemsByProductId(productId);
        return ResponseEntity.ok(orderItems);
    }

    @GetMapping("/order/{orderId}/delete")
    public ResponseEntity<Void> deleteAllOrderItemsByOrderId(@PathVariable Long orderId) {
        orderItemService.deleteAllOrderItemsByOrderId(orderId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{orderItemId}/delete")
    public ResponseEntity<Void> deleteOrderItem(@PathVariable Long orderItemId) {
        orderItemService.deleteOrderItem(orderItemId);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/{orderItemId}/update")
    public ResponseEntity<OrderItems> updateOrderItem(@PathVariable Long orderItemId, OrderItems orderItem) {
        OrderItems updatedOrderItem = orderItemService.updateOrderItem(orderItemId, orderItem);
        return ResponseEntity.ok(updatedOrderItem);
    }
    @PostMapping
    public ResponseEntity<OrderItems> createOrderItem(OrderItems orderItem) {
        OrderItems createdOrderItem = orderItemService.createOrderItem(orderItem);
        return ResponseEntity.ok(createdOrderItem);
    }
}
