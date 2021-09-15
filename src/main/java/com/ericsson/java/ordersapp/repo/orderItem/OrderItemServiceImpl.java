package com.ericsson.java.ordersapp.repo.orderItem;

import com.ericsson.java.ordersapp.model.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class OrderItemServiceImpl {

    @Autowired
    OrderItemRepository orderItemRepository;

    public OrderItem create(OrderItem orderItem) {
        return orderItemRepository.save(orderItem);
    }

    public List<OrderItem> getAll() {
        return orderItemRepository.findAll();
    }

    public OrderItem findOneById(long id) {
        return orderItemRepository.findById(id).get();
    }

    public OrderItem update(OrderItem orderitem, int id) {
        OrderItem updateOrderItem = findOneById(id);
        updateOrderItem.setName(orderitem.getName());
        updateOrderItem.setPrice(orderitem.getPrice());
        return orderItemRepository.saveAndFlush(orderitem);
    }

    public void deleteById(long id) {
        orderItemRepository.deleteById(id);
    }
}
