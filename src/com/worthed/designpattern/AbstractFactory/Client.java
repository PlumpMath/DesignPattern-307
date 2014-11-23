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

package com.worthed.designpattern.AbstractFactory;

/**
 * 抽象工厂(Abstract Factory)，提供一个创建一系列相关或相互依赖对象的接口，而无需指定他们具体的类。
 *
 * Created by zhenguo on 11/22/14.
 */
public class Client {

    public static void main(String[] args) {
        IFactory factory;
        IProductA productA;
        IProductB productB;

        factory = new Factory1();
        productA = factory.createProductA();
        productB = factory.createProductB();
        productA.run();
        productB.run();

        factory = new Factory2();
        productA = factory.createProductA();
        productB = factory.createProductB();
        productA.run();
        productB.run();

    }

}
