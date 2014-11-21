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

package com.worthed.designpattern.FactoryMethod;

/**
 * 工厂方法模式是定义一个创建产品对象的工厂接口，工厂接口本身不去创建对象，
 * 而是交给其子类或者是其实现类去创建，将实际创建工作推迟到子类中进行。
 *
 * Created by zhenguo on 11/21/14.
 */
public class Client {

    /**
     * 工厂方法模式的用意是定义一个创建产品对象的工厂接口，将实际创建工作推迟到子类中。
     *
     * @param args
     */
    public static void main(String[] args) {

        double result;
        /** 加法操作 */
        IFactory addFactory = new AddFactory();
        Operation addOperation = addFactory.createOperation();
        addOperation.setNum1(3);
        addOperation.setNum2(5);
        result = addOperation.getResult();
        System.out.println("AddOperation result : " + result);

        /** 减法操作 */
        IFactory subFactory = new SubFactory();
        Operation subOperation = subFactory.createOperation();
        subOperation.setNum1(3);
        subOperation.setNum2(5);
        result = subOperation.getResult();
        System.out.println("SubOperation result : " + result);

    }

}
