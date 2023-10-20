package com.order.entiry;

import com.cart.entity.CartItem;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;
import java.util.List;


@Table(name = "order")
public class Order {

    @Id
    private String id;
    private List<CartItem> cartItems;
    private String orderStatus;


    public Order(List<CartItem> cartItems, String orderStatus) {
        this.cartItems = cartItems;
        this.orderStatus = orderStatus;
    }
}
