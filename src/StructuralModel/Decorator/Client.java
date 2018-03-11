package StructuralModel.Decorator;

import StructuralModel.Decorator.Component.Component;
import StructuralModel.Decorator.Component.ConcreteComponent;
import StructuralModel.Decorator.Decorator.ConcreteDecoratorA;
import StructuralModel.Decorator.Decorator.ConcreteDecoratorB;
import StructuralModel.Decorator.Decorator.Decorator;

/**
 * Created by Administrator on 2018/3/11.
 */
public class Client {
    public static void main(String[] args) {
        Component component= new ConcreteComponent();

        Decorator decoratorA=new ConcreteDecoratorA(component);
        decoratorA.operation();
        Decorator decoratorB=new ConcreteDecoratorB(component);
        decoratorB.operation();

        System.out.println("------------------------------------");

        // 装饰器也可以装饰具体的装饰对象，此时相当于给对象在增加A的功能基础上再添加功能B
        Decorator decoratorBandA = new ConcreteDecoratorB(decoratorA);
        decoratorBandA.operation();
    }
}
