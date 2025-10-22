package org.example;

import java.util.ArrayList;
import java.util.List;

public class ShopService {

    private OrderRepo orderRepo;
    private ProductRepo productRepo;

    public ShopService(OrderRepo orderRepo, ProductRepo productRepo) {
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


    public void showAllProducts(){
        List<Product> products = productRepo.getProducts();
        System.out.println("All available products:");
        for(Product p : products){
            System.out.println(p);
        }
    }
}
