package org.example;

import java.util.List;
import java.util.Objects;

public class ProductRepo {
    List<Product> products;

    public void  addProduct(Product product){
        products.add(product);
        System.out.println("Added product "+product + "to List");
    }

    public void  removeProduct(Product product){
        products.remove(product);
        System.out.println("Removed product "+product + "from List");
    }

    public Product searchProduct(String productId){
        for (Product product : products) {
          if(product.productId().equals(productId)) {
              return product;
          }
        }
        System.out.println("No product with id "+productId+" found");
        return null;

    }


    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ProductRepo that = (ProductRepo) o;
        return Objects.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(products);
    }

    @Override
    public String toString() {
        return "ProductRepo{" +
                "products=" + products +
                '}';
    }
}
