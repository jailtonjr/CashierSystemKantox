/**
 * Project: CashierSystemKantox
 * Created by: Jailton Louzada
 * WebSite: https://jailtonjr.dev
 * Description: Product
 */
public class Product {

    private  String code;
    private String name;
    private Double price;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String printAll() {
        return "Code:" +code+" Name:"+name+" Price:"+ price ;
    }
}
