package CreateMode.Builder.Director;

import CreateMode.Builder.Builder.Builder;
import CreateMode.Builder.Builder.ConcreteBuilder;
import CreateMode.Builder.Product.Product;
/**
 * Created by Administrator on 2018/3/11.
 */
public class Director {
    private Builder b = new ConcreteBuilder();

    public Product getAProduct(){
        b.buildPart("宝马","X7");
        return b.getResult();
    }
    public Product getBProduct(){
        b.buildPart("奥迪","Q5");
        return b.getResult();
    }
}
