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

package com.worthed.designpattern.ChainOfResponsibility;

/**
 * 客户端调用
 * 职责链模式(Chain of Responsibility)，使多个对象都有机会处理请求，从而避免请求的发送者和接受者之间的耦合
 * 关系。将这个对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止。
 *
 * Created by zhenguo on 12/11/14.
 */
public class Client {

    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();
        handler1.setSuccessor(handler2);
        handler2.setSuccessor(handler3);

        int[] requests = {2, 15, 25, 10, 20};
        for (int request : requests) {
            handler1.handlerRequest(request);
        }
    }

}
