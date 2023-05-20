import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;

/**
 * Project: CashierSystemKantox
 * Created by: Jailton Louzada
 * WebSite: https://jailtonjr.dev
 * Description: TestYaml
 */
public class TestYaml {

    public static void main(String[] args) throws IOException {
    Util util = new Util();
    Iterable<Object> itr = util.loadFromYamlFile(util.productPath());
        for (Object o : itr) {
            System.out.println("element type: " + o.getClass());
            System.out.println(o);
        }

    }
}
