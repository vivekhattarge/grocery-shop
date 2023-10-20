package com.cart.entity;

import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;
import java.util.List;


@Table(name =  "cart")
public class Cart {

    @Id
    private String id;
    private String userId;
    List<CartItem> cartItems;

    public Cart(String userId, List<CartItem> cartItems) {
        this.userId = userId;
        this.cartItems = cartItems;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }
}
