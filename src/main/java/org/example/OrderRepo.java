package org.example;

import java.util.List;

public interface OrderRepo {

    public void addOrder(Order order);
    public void removeOrder(Order order);
    public Order getOrderById(String orderId);
    public List<Order> getOrders();
}
