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

package com.worthed.designpattern.Observer;

/**
 * 客户端调用
 * 观察者模式(Observer)，又叫发布-订阅模式(Publish/Subscribe)，定义了一种一对多的依赖关系，让多个观察者对象
 * 同时监听某一个主题对象。这个主体对象在状态发生变化时，会通知所有观察者对象，使它们能够自动更新自己。
 *
 * Created by zhenguo on 11/29/14.
 */
public class Client {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        subject.attach(new ConcreteObserver("A", subject));
        subject.attach(new ConcreteObserver("B", subject));
        subject.attach(new ConcreteObserver("C", subject));

        subject.setState("XYZ");
        subject.notifyAllObservers();

    }

}
