package com.ericsson.java.ordersapp.repo.order;

import com.ericsson.java.ordersapp.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
