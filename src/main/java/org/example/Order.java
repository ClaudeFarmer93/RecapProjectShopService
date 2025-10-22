package org.example;

import java.util.List;

public record Order(
        String orderId,
        List<String> productIds
        // List<Product> orderProducts

) {
}
