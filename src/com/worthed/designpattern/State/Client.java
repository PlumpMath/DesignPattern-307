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

package com.worthed.designpattern.State;

/**
 * 当一个对象的内在状态改变时允许改变其行为，这个对象看起来像是改变了其类。
 *
 * Created by zhenguo on 11/26/14.
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateA());
        // 不断地进行请求，同时更改状态
        context.request();
        context.request();
        context.request();
        context.request();
    }

}
