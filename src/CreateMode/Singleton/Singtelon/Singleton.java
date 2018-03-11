package CreateMode.Singleton.Singtelon;

/**
 * Created by Administrator on 2018/3/11.
 */
public class Singleton {
    //类中static定义的变量无需创建该类对象就存在了
    private static  Singleton s= new Singleton();
    private Singleton(){
            //构造函数私有化
    }
    public static Singleton getInstance(){
        return s;//向外暴露一个调用唯一实例化的方法
    }
    public void doSomething(){
        System.out.println("此处可写业务逻辑");
    }
}
