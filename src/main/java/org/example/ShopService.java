package org.example;

import java.util.List;

public class ShopService {

    private OrderRepo orderRepo;
    private ProductRepo productRepo;

    public ShopService(OrderRepo orderRepo, ProductRepo productRepo) {
        this.orderRepo = orderRepo;
        this.productRepo = productRepo;
    }

    public void placeNewOrder(Order order) {
        boolean allProductsAvailable = true;
        for (String pId : order.productIds()) {
            Product p = productRepo.searchProduct(pId);

            if (p == null) {
                System.out.println("Product with id " + pId + " not found");
                allProductsAvailable = false;
            } else {
                System.out.println("Product with id " + pId + " found");
            }
        }
        if (allProductsAvailable) {
            orderRepo.addOrder(order);
            System.out.println("Order " + order.orderId() + " placed successfully");
        } else {
            System.out.println("Order " + order.orderId() + " couldn't be placed due to missing products");
        }
    }


    public void showAllProducts() {
        List<Product> products = productRepo.getProducts();
        System.out.println("All available products:");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
