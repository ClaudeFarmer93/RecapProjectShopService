package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderMapRepo implements OrderRepo {
    private Map<String, Order> orders = new HashMap<>();


    @Override
    public void addOrder(Order order) {
        orders.put(order.orderId(), order);
        System.out.println("Order added to OrderMap: " + order.orderId());
    }

    @Override
    public void removeOrder(Order order) {
        orders.remove(order.orderId());
        System.out.println("Order removed from OrderMap: " + order.orderId());
    }

    @Override
    public Order getOrderById(String orderId) {
        Order order = orders.get(orderId);
        if (order == null) {
            System.out.println("No order found for orderId: " + orderId);
            return null;
        }
        return order;
    }

    @Override
    public List<Order> getOrders() {
        List<Order> ordersList = new ArrayList<>(orders.values());
        return ordersList;
    }
}
