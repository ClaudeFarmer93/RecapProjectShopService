package org.example;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        ProductRepo productRepoBakery = new ProductRepo();
        OrderRepo orderRepoBakery = new OrderListRepo();

        ShopService bakery = new ShopService(orderRepoBakery,productRepoBakery);


        Product broetchen = new Product("P001", "Brötchen", 54, 0.54);
        Product croissant =  new Product("P002", "Croissant", 40, 1.55);
        Product brezel = new Product("P003", "Brezel", 25, 0.95);
        Product sourdough = new Product("P004", "Sourdough", 10, 6.95);
        Product krapfen = new Product("P005", "Krapfen", 10, 1.75);

        productRepoBakery.addProduct(broetchen);
        productRepoBakery.addProduct(croissant);
        productRepoBakery.addProduct(brezel);
        productRepoBakery.addProduct(sourdough);
        productRepoBakery.addProduct(krapfen);

        bakery.showAllProducts();

        Order firstorder = new Order("ORD001", List.of("P001", "P002", "P005"));
        bakery.placeNewOrder(firstorder);

        ProductRepo productRepoCafe = new ProductRepo();
        OrderRepo orderRepoCafe = new OrderMapRepo();
        ShopService cafe = new ShopService(orderRepoCafe,productRepoCafe);

        Product espresso = new Product("P001", "Espresso", 100, 0.95);
        Product cappuccino = new Product("P002", "Cappuccino", 50, 1.50);
        Product flatWhite = new Product("P003", "Flat White", 50, 1.98);
        Product americano =  new Product("P004", "Americano", 40, 1.25);

        productRepoCafe.addProduct(cappuccino);
        productRepoCafe.addProduct(flatWhite);
        productRepoCafe.addProduct(americano);
        productRepoCafe.addProduct(espresso);

        cafe.showAllProducts();
        Order coffeeOrder = new Order("ORD001", List.of("P001", "P002", "P004"));
        cafe.placeNewOrder(coffeeOrder);
    }
}
