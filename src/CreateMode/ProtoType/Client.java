package CreateMode.ProtoType;

import CreateMode.ProtoType.ProtoType.ConcretePrototype1;
import CreateMode.ProtoType.ProtoType.ConcretePrototype2;

/**
 * Created by Administrator on 2018/3/11.
 *  使用原型模式创建对象比直接new一个对象在性能上要好的多，
 *  因为Object类的clone方法是一个本地方法，它直接操作内存中的二进制流，
 *  特别是复制大对象时，性能的差别非常明显。
 */
public class Client {
    public static void main(String[] args){
        ConcretePrototype1 cp1 = new ConcretePrototype1();
        for(int i=0;i<10;i++){
            ConcretePrototype1 clonecp1=(ConcretePrototype1)cp1.clone();
            clonecp1.show();
        }

        ConcretePrototype2 cp2 = new ConcretePrototype2();
        for(int i=0;i<10;i++){
            ConcretePrototype2 clonecp2=(ConcretePrototype2)cp2.clone();
            clonecp2.show();
        }
    }
}
