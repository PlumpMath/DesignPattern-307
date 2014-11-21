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

package com.worthed.designpattern.SimpleFactory;

/**
 * 简单工厂模式是属于创建型模式，又叫做静态工厂方法（Static Factory Method）模式，
 * 简单工厂模式是由一个工厂对象决定创建出哪一种产品类的实例。简单工厂模式是工厂模式家族中最简单实用的模式。
 *
 * Created by zhenguo on 11/22/14.
 */
public class Client {

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();

        Operation addOperation = simpleFactory.createOperation('+');
        System.out.println(addOperation.operate(3.0, 5.0));

        Operation subOperation = simpleFactory.createOperation('-');
        System.out.println(subOperation.operate(3.0, 5.0));

        Operation mulOperation = simpleFactory.createOperation('*');
        System.out.println(mulOperation.operate(3.0, 5.0));

        Operation divOperation = simpleFactory.createOperation('/');
        System.out.println(divOperation.operate(3.0, 5.0));

    }

}
