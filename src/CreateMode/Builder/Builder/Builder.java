package CreateMode.Builder.Builder;

import CreateMode.Builder.Product.Product;

/**
 * Created by Administrator on 2018/3/11.
 */
public abstract class Builder {
    //为啥不是定义为接口？
    public abstract void buildPart(String arg1,String arg2);
    public abstract Product getResult();
}
