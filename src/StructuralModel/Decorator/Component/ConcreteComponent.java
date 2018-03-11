package StructuralModel.Decorator.Component;

/**
 * Created by Administrator on 2018/3/11.
 */
public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("具体对象自身的方法");
    }
}
