package CreateMode.Builder;

import CreateMode.Builder.Director.Director;
import CreateMode.Builder.Product.Product;


/**
 * Created by Administrator on 2018/3/11.
 */
public class Client {
    public static void main(String[] args){
        Director d= new Director();
        Product p1= d.getAProduct();
        p1.showProduct();
        Product p2= d.getBProduct();
        p2.showProduct();
    }
}
