package StructuralModel.Decorator.Decorator;

import StructuralModel.Decorator.Component.Component;

/**
 * Created by Administrator on 2018/3/11.
 */
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }
    //因为只暴露给用户operation方法，所以此处私有化
    private void operationBefore(){
        System.out.println("A装饰器早期的工作");
    }
    private void operationAfter(){
        System.out.println("A装饰器后期的工作");
    }
    public void operation(){
        operationBefore();
        super.operation();
        operationAfter();
    }
}
