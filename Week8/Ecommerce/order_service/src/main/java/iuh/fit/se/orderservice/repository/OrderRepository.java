package iuh.fit.se.orderservice.repository;

import iuh.fit.se.orderservice.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface OrderRepository extends JpaRepository<Orders, Long> {
    @Query("SELECT o FROM Orders o WHERE o.customerId = :customerId")
    List<Orders> findAllByCustomerId(@Param("customerId") Long customerId);

    @Query("SELECT o FROM Orders o WHERE o.status = :status")
    List<Orders> findAllByStatus(@Param("status") String status);
}
