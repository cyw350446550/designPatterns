package CreateMode.Abstract_factory;

import CreateMode.Abstract_factory.Factory.ConcreteFactory1;
import CreateMode.Abstract_factory.Factory.Factory;

/**
 * Created by Administrator on 2018/3/11.
 * 抽象工厂模式
 */
public class Client {
    public static void main(String []args){
        //可以自由组合多种工厂交与客户
        Factory f = new ConcreteFactory1();
        f.createProduct_A().Product_A_method();
        f.createProduct_B().Product_B_method();
    }
}
