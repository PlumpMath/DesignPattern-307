/*
 * Copyright 2014 jinzhenguo1990@gmail.com
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.worthed.designpattern.Decorator;

/**
 * 装饰者模式（Decorator）也叫包装器模式（Wrapper）。
 *  1. 动态地给一个对象添加一些额外的职责。
 *  2. 遵循开闭原则
 *
 * Created by zhenguo on 11/20/14.
 */
public class Client {

    /**
     * 在不必改变原类文件和使用继承的情况下，动态地扩展一个对象的功能。
     * 它是通过创建一个包装对象，也就是装饰来包裹真实的对象。
     *
     * @param args
     */
    public static void main(String[] args) {
        /** 用ConcreteDecoratorA和ConcreteDecoratorB来装饰ConcreteComponent */
        ConcreteComponent concreteComponent = new ConcreteComponent();
        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA(concreteComponent);
        ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB(concreteDecoratorA);

        concreteDecoratorB.operation();
    }

}
