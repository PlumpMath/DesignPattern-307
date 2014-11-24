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

package com.worthed.designpattern.Prototype;

/**
 * 原型模式(Prototype)，用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 * 原型模式其实就是从一个对象再创建另外一个可定制的对象，而且不需知道任何的创建的细节。
 *
 * Created by zhenguo on 11/23/14.
 */
public class Client {

    public static void main(String[] args) {

        ConcretePrototype concretePrototype = new ConcretePrototype("张三");
        concretePrototype.age = 24;

        ConcretePrototype concretePrototype1 = (ConcretePrototype) concretePrototype.clone();
        concretePrototype1.age = 14;

        System.out.println(String.format("用户：%s 年龄：%d", concretePrototype.name, concretePrototype.age));
        System.out.println(String.format("用户：%s 年龄：%d", concretePrototype1.name, concretePrototype1.age));

    }

}
