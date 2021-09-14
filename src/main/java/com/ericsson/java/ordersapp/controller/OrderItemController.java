package com.ericsson.java.ordersapp.controller;

import com.ericsson.java.ordersapp.model.OrderItem;
import com.ericsson.java.ordersapp.repo.order.OrderRepository;
import com.ericsson.java.ordersapp.repo.orderItem.OrderItemServiceImpl;
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
@RequestMapping(OrderItemController.BASE_URL)
public class OrderItemController {

    public static final String BASE_URL = "/orderItems";

    @Autowired
    OrderItemServiceImpl orderItemService;

    @PostMapping(value = BASE_URL)
    public ResponseEntity<OrderItem> save(@RequestBody OrderItem orderItem) {
        return ResponseEntity.ok(orderItemService.create(orderItem));
    }

    @GetMapping(value = BASE_URL)
    public ResponseEntity<List<OrderItem>> getAll() {
        return ResponseEntity.ok(orderItemService.getAll());
    }

    @GetMapping(BASE_URL + "/{id}")
    public ResponseEntity<OrderItem> getOneById(@PathVariable(value = "id") int id) {
        return ResponseEntity.ok(orderItemService.findOneById(id));
    }

    @PutMapping(value = BASE_URL + "/{id}")
    public ResponseEntity<OrderItem> update(@PathVariable(value = "id") int id,
                                            @Valid @RequestBody OrderItem orderItem) {
        return ResponseEntity.ok(orderItemService.update(orderItem, id));
    }

    @DeleteMapping(value = BASE_URL + "/{id}")
    public void delete(@PathVariable(value = "id") int id) {
        orderItemService.deleteById(id);
    }

}
