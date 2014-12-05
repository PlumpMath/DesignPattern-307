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

package com.worthed.designpattern.Singleton;

/**
 * 单例模式客户端调用
 * 简单说来，单例模式（也叫单件模式）的作用就是保证在整个应用程序的生命周期中，
 * 任何一个时刻，单例类的实例都只存在一个（当然也可以不存在）。
 *
 * Created by zhenguo on 12/5/14.
 */
public class Client {

    public static void main(String[] args) {
        SingletonA singletonA1 = SingletonA.getInstance();
        SingletonA singletonA2 = SingletonA.getInstance();
        if (singletonA1 == singletonA2) {
            System.out.println("singletonA1和singletonA2是一个对象");
        } else {
            System.out.println("singletonA1和singletonA2不是一个对象");
        }
        
        SingletonB singletonB1 = SingletonB.getInstance();
        SingletonB singletonB2 = SingletonB.getInstance();
        if (singletonB1 == singletonB2) {
            System.out.println("singletonB1和singletonB2是一个对象");
        } else {
            System.out.println("singletonB1和singletonB2不是一个对象");
        }
    }

}
