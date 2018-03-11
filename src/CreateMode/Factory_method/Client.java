package CreateMode.Factory_method;

import CreateMode.Factory_method.Factory.ConcreteFactory;
import CreateMode.Factory_method.Factory.Factory;
import CreateMode.Factory_method.Product.Product;

/**
 * Created by Administrator on 2018/3/11.
 * 工厂方法模式
 */
public class Client {
    public static void main(String []args){
        //产品由工厂封装好再交与用户,用户只知道工厂即可
       Factory f = new ConcreteFactory();
       Product p = f.factoryMethod();
       p.productMethod();
    }
 }
