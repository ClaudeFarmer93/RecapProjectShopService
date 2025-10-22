package org.example;

public class ShopService {

    private OrderListRepo orderRepo;
    private ProductRepo productRepo;

    public ShopService(OrderListRepo orderRepo, ProductRepo productRepo) {
        this.orderRepo = orderRepo;
        this.productRepo = productRepo;
    }

    public void placeNewOrder(Order order) {
    }
}
