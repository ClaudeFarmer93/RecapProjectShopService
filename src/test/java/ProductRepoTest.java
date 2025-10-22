import org.example.Product;
import org.example.ProductRepo;
import org.junit.jupiter.api.*;


import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;


public class ProductRepoTest {

    private ProductRepo testRepo;
    private Product espresso;
    private Product cappuccino;

    @BeforeEach
    public void setUp() {
        testRepo = new ProductRepo();
        espresso = new Product("P001", "Espresso", 100, new BigDecimal("0.95"));
        cappuccino = new Product("P002", "Cappuccino", 50, new BigDecimal("1.50"));
    }

    @Test
    void addProduct_shouldStoreProductInList() {
        testRepo.addProduct(espresso);
        assertThat(testRepo.getProducts()).contains(espresso);
    }

    @Test
    void removeProduct_shouldRemoveProductFromList() {
        testRepo.addProduct(espresso);
        testRepo.addProduct(cappuccino);
        testRepo.removeProduct(espresso);
        assertThat(testRepo.getProducts()).doesNotContain(espresso);
        assertThat(testRepo.getProducts()).contains(cappuccino);
    }

    @Test
    void getAllProducts_shouldReturnAllProducts() {
        testRepo.addProduct(espresso);
        testRepo.addProduct(cappuccino);
        assertThat(testRepo.getProducts()).contains(cappuccino, espresso);

    }
}
