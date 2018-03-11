package CreateMode.Builder.Product;

/**
 * Created by Administrator on 2018/3/11.
 */
public class Product {
    private String name;
    private String type;

    public void showProduct(){
        System.out.print("名称："+name);
        System.out.println("  型号："+type);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
