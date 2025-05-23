package com.Order.Order.OrderServices;

import com.Order.Order.OrderEntities.Orders;
import com.Order.Order.OrderRepository.OrderDataAccessJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderDataAccessJPA orderDataAccessJPA;

    public List<Orders> getAllOrders() {
        return orderDataAccessJPA.findAll();
    }

    public Orders getOrderbyOrderId(String id) {
        return orderDataAccessJPA.findById(id).orElseThrow(() -> new RuntimeException("No Order found with order id"));
    }

    public void addOrder(Orders order) {
        orderDataAccessJPA.save(order);
    }

    public void updateOrderByOrderId(Orders order) {
        orderDataAccessJPA.save(order);

    }

    public void deleteAllOrders() {
        orderDataAccessJPA.deleteAll();
    }
}
