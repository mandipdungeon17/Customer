package com.Order.Order.OrderController;

import com.Order.Order.OrderEntities.Orders;
import com.Order.Order.OrderServices.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderBasicController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")
    public List<Orders> getAllOrders(){
        return orderService.getAllOrders();
    }
    @GetMapping("/orders/{id}")
    public Orders getOrderById(@PathVariable String id){
        return orderService.getOrderbyOrderId(id);
    }

    @PostMapping("/orders")
    public String addOrder(@RequestBody Orders order){
        orderService.addOrder(order);
        return "Order added Sucessfully";
    }

    @PutMapping("/orders")
    public String updateOrderById(@RequestBody Orders order ){
        orderService.updateOrderByOrderId(order);
        return "Order updated for Id";
    }

    @DeleteMapping("/orders")
    public String deleteAllOrder(){
        orderService.deleteAllOrders();
        return "Deleted All orders !";
    }
}

