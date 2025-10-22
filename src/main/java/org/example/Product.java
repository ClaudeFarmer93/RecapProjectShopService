package org.example;

import java.math.BigDecimal;

public record Product(String productId, String productName, int productStock, BigDecimal productPrice) {
}
