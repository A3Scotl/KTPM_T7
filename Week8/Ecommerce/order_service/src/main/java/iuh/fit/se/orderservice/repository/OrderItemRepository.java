package iuh.fit.se.orderservice.repository;

import iuh.fit.se.orderservice.entity.OrderItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItems, Long> {
    @Query("SELECT oi FROM OrderItems oi WHERE oi.order.id = :orderId")
    List<OrderItems> findAllByOrderId(@Param("orderId") Long orderId);

    @Query("SELECT oi FROM OrderItems oi WHERE oi.productId = :productId")
    List<OrderItems> findAllByProductId(@Param("productId") Long productId);
}
