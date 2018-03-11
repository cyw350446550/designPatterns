package CreateMode.ProtoType.ProtoType;

/**
 * Created by Administrator on 2018/3/11.
 */
public class Prototype implements Cloneable {
    public Prototype clone(){
        Prototype p=null;
        try {
            p=(Prototype)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
