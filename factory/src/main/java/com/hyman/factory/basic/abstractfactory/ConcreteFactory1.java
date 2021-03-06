package com.hyman.factory.basic.abstractfactory;

/**
 * @author HuHan
 * @description
 * @date 2019/10/31 10:52
 */
public class ConcreteFactory1 extends AbstractFactory {
    AbstractProductA createProductA() {
        return new ProductA1();
    }

    AbstractProductB createProductB() {
        return new ProductB1();
    }
}
