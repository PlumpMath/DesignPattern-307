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

package com.worthed.designpattern.Flyweight;

/**
 * 客户端调用
 *
 * Created by zhenguo on 12/15/14.
 */
public class Client {

    public static void main(String[] args) {
        int id = 20;

        FlyweightFactory flyweightFactory = new FlyweightFactory();

        Flyweight fx = flyweightFactory.getFlyweight("X");
        fx.operation(--id);

        Flyweight fy = flyweightFactory.getFlyweight("Y");
        fy.operation(--id);

        Flyweight fz = flyweightFactory.getFlyweight("Z");
        fz.operation(--id);

        UnsharedConcreteFlyweight unsharedConcreteFlyweight = new UnsharedConcreteFlyweight();
        unsharedConcreteFlyweight.operation(--id);

    }

}
