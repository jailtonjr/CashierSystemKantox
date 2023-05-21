import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;

/**
 * Project: CashierSystemKantox
 * Created by: Jailton Louzada
 * WebSite: https://jailtonjr.dev
 * Description: Product
 */
public class ProductImpl {

    private String productPath = Util.productPath();


    public Products loadProductsFromYamlFile(Products products) {
        Yaml yaml = new Yaml();
        try (InputStream in = Products.class.getResourceAsStream(productPath)) {
            products = yaml.loadAs(in, Products.class);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return products;
    }

}
