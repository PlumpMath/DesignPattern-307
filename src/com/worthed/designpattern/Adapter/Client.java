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

package com.worthed.designpattern.Adapter;

/**
 * 客户端调用
 * 适配器模式(Adapter)，将一个类的接口转换成客户希望的另外一个接口。Adapter模式使得原本由于接口
 * 不兼容而不能一起工作的那些类可以一起工作。
 * 适配器模式实现方式有两种：类适配和对象适配
 *
 * Created by zhenguo on 11/29/14.
 */
public class Client {

    public static void main(String[] args) {
        // 类适配
        System.out.println("类适配：");
        ClassAdapter classAdapter = new ClassAdapter();
        classAdapter.run();
        classAdapter.fly();

        // 对象适配
        System.out.println("对象适配：");
        ObjectAdapter objectAdapter = new ObjectAdapter();
        objectAdapter.run();
        objectAdapter.fly();

    }

}
