package org.example;

import java.util.ArrayList;
import java.util.List;

public class OrderListRepo {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeOrder(Order order) {
        orders.remove(order);
    }
    public List<Order> getOrders() {
        return orders;
    }
    public Order getOrderById(String orderId) {

        for (Order order : orders) {
            if(order.orderId().equals(orderId)) {
                return order;
            }
        }
        System.out.println("No order found with orderId: " + orderId);
        return null;
    }
}
