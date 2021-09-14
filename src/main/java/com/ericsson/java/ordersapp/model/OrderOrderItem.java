package com.ericsson.java.ordersapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "Order_OrderItem")
public class OrderOrderItem {

    @Column(name = "OrderId")
    private long orderId;

    @Column(name = "OrderItemId")
    private long OrderItemId;
}
