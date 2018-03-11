package CreateMode.Builder.Builder;

import CreateMode.Builder.Product.Product;

/**
 * Created by Administrator on 2018/3/11.
 */
public class ConcreteBuilder extends Builder{
    private Product p = new Product();

    @Override
    public void buildPart(String arg1, String arg2) {
        p.setName(arg1);
        p.setType(arg2);
    }

    @Override
    public Product getResult() {
        return p;
    }
}
