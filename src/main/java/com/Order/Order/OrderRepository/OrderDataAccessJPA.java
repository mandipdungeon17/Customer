package com.Order.Order.OrderRepository;

import com.Order.Order.OrderEntities.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDataAccessJPA extends JpaRepository<Orders,String> {
}
