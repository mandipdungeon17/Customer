package com.Order.Order.OrderEntities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ordersId;
    private Date odate;
    private float totalAmount;
    private String status;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="orders_id")
    private List<OrderItem> orderItemList;



}
