import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Project: CashierSystemKantox
 * Created by: Jailton Louzada
 * WebSite: https://jailtonjr.dev
 * Description: Utils
 */
public final class Util {

    public static Iterable<Object> loadProductsFromYamlFile(String path) {
        Yaml yaml = new Yaml();
        InputStream in = Util.class.getResourceAsStream(path);
        Iterable<Object> list = yaml.loadAll(in);

        return list;
    }

    public static String productPath() {
        Properties prop = new Properties();
        String fileName = "src/main/resources/config.properties";
        try (FileInputStream fis = new FileInputStream(fileName)) {
            prop.load(fis);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
        return prop.getProperty("products_path");
    }

    public static String rulesPath() {
        Properties prop = new Properties();
        String fileName = "src/main/resources/config.properties";
        try (FileInputStream fis = new FileInputStream(fileName)) {
            prop.load(fis);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
        return prop.getProperty("rules_path");
    }

}
