import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Project: CashierSystemKantox
 * Created by: Jailton Louzada
 * WebSite: https://jailtonjr.dev
 * Description: ProductTest Unit Tests
 */
public class ProductsImplTest {

    @Test
    void shouldLoadTheYmlFile () {

        var products = new Products();
        var product = new ProductImpl();
        products = product.loadProductsFromYamlFile(products);
        Assert.assertNotNull(products);
    }

    @Test
    void shouldLoadTheProducts () {

        var products = new Products();
        var product = new ProductImpl();
        products = product.loadProductsFromYamlFile(products);
        Assert.assertEquals("Green Tea", products.getProducts().get(0).getName());
        Assert.assertEquals("GR1", products.getProducts().get(0).getCode());
        Assert.assertEquals(3.11, products.getProducts().get(0).getPrice());
        Assert.assertEquals("Strawberries", products.getProducts().get(1).getName());
        Assert.assertEquals("SR1", products.getProducts().get(1).getCode());
        Assert.assertEquals(5, products.getProducts().get(1).getPrice());
        Assert.assertEquals("Coffee", products.getProducts().get(2).getName());
        Assert.assertEquals("CF1", products.getProducts().get(2).getCode());
        Assert.assertEquals(11.23, products.getProducts().get(2).getPrice());
    }

}