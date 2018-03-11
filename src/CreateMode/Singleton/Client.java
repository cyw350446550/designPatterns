package CreateMode.Singleton;

import CreateMode.Singleton.Singtelon.Singleton;

/**
 * Created by Administrator on 2018/3/11.
 */
public class Client {
    public static void main(String[] args){
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1);
        System.out.println(s2);
    }
}
