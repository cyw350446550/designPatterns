package CreateMode.Factory_method.Product;

/**
 * Created by Administrator on 2018/3/11.
 */
public class ConcreteProduct implements Product{

    @Override
    public void productMethod() {
        System.out.println("具体某一产品");
    }
}
