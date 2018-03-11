package StructuralModel.Decorator.Decorator;

import StructuralModel.Decorator.Component.Component;

/**
 * Created by Administrator on 2018/3/11.
 */
public abstract class Decorator extends Component{
    protected Component component;

    //维持一个指向组件对象的接口对象
    public Decorator(Component component){
        this.component=component;
    }
    //定义一个与组件接口一致的接口
    public void operation(){
        component.operation();
    }

}
