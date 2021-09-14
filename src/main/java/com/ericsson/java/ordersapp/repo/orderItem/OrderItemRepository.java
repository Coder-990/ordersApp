package com.ericsson.java.ordersapp.repo.orderItem;

import com.ericsson.java.ordersapp.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
