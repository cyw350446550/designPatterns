package CreateMode.Abstract_factory.Factory;

import CreateMode.Abstract_factory.Product.Product_A.ConcreteProduct_A2;
import CreateMode.Abstract_factory.Product.Product_A.Product_A;
import CreateMode.Abstract_factory.Product.Product_B.ConreteProduct_B2;
import CreateMode.Abstract_factory.Product.Product_B.Product_B;

/**
 * Created by Administrator on 2018/3/11.
 */
public class ConcreteFactory2 implements Factory {
    @Override
    public Product_A createProduct_A() {
        return new ConcreteProduct_A2();
    }

    @Override
    public Product_B createProduct_B() {
        return new ConreteProduct_B2();
    }
}
