package org.example;

import java.util.ArrayList;

public class ShopService {

    private OrderListRepo orderRepo;
    private ProductRepo productRepo;

    public ShopService(OrderListRepo orderRepo, ProductRepo productRepo) {
        this.orderRepo = orderRepo;
        this.productRepo = productRepo;
    }

    public void placeNewOrder(Order order) {
        for(String pId : order.productIds()){
            Product p = productRepo.searchProduct(pId);

            if(p == null){
                System.out.println("Product with id " + pId + " not found");
            }
            else{
                System.out.println("Product with id " + pId + " found");
            }
            orderRepo.addOrder(order);
        }
    }
}
