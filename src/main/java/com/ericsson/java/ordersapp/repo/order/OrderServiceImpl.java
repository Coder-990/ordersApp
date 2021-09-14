package com.ericsson.java.ordersapp.repo.order;

import com.ericsson.java.ordersapp.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class OrderServiceImpl {

    @Autowired
    OrderRepository orderRepository;

    public Order create(Order order) {
        return orderRepository.save(order);
    }

    public List<Order> getAll() {
        return orderRepository.findAll();
    }

    public Order findOneById(long id) {
        return orderRepository.findById(id).get();
    }

    public Order update(Order order, int id) {
        Order orderUpdate = findOneById(id);
        orderUpdate.setCreated(order.getCreated());
        orderUpdate.setCustomerName(order.getCustomerName());
        orderUpdate.setCustomerAddress(order.getCustomerAddress());
        return orderRepository.saveAndFlush(order);
    }

    public void deleteById(long id) {
        orderRepository.deleteById(id);
    }


}
