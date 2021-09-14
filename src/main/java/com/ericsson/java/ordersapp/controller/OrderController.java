package com.ericsson.java.ordersapp.controller;

import com.ericsson.java.ordersapp.model.Order;
import com.ericsson.java.ordersapp.repo.order.OrderServiceImpl;
import com.ericsson.java.ordersapp.repo.orderItem.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(OrderController.BASE_URL)
public class OrderController {

    public static final String BASE_URL = "/orders";

    @Autowired
    OrderServiceImpl orderService;

    @PostMapping(BASE_URL)
    public ResponseEntity<Order> save(@RequestBody Order order) {
        return ResponseEntity.ok(orderService.create(order));
    }

    @GetMapping(BASE_URL)
    public ResponseEntity<List<Order>> getAll() {
        return ResponseEntity.ok(orderService.getAll());
    }

    @GetMapping(BASE_URL + "/{id}")
    public ResponseEntity<Order> getOneById(@PathVariable(value = "id") int id) {
        return ResponseEntity.ok(orderService.findOneById(id));
    }

    @PutMapping(BASE_URL + "/{id}")
    public ResponseEntity<Order> update(@PathVariable(value = "id") int id, @Valid @RequestBody Order order) {
        return ResponseEntity.ok(orderService.update(order, id));
    }

    @DeleteMapping(BASE_URL + "/{id}")
    public void delete(@PathVariable(value = "id") int id) {
        orderService.deleteById(id);
    }


}
