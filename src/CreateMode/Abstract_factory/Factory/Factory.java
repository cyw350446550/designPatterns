package CreateMode.Abstract_factory.Factory;

import CreateMode.Abstract_factory.Product.Product_A.Product_A;
import CreateMode.Abstract_factory.Product.Product_B.Product_B;

/**
 * Created by Administrator on 2018/3/11.
 */
public interface Factory {
    public Product_A createProduct_A();
    public Product_B createProduct_B();
}
