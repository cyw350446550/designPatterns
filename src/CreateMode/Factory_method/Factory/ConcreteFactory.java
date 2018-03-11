package CreateMode.Factory_method.Factory;

import CreateMode.Factory_method.Product.ConcreteProduct;
import CreateMode.Factory_method.Product.Product;


/**
 * Created by Administrator on 2018/3/11.
 */
public class ConcreteFactory implements Factory {

    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
