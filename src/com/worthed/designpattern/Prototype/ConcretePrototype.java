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
 * 具体的实现对象
 *
 * Created by zhenguo on 11/23/14.
 */
public class ConcretePrototype implements Prototype {

    public String name = "tag";
    public int age = 0;

    public ConcretePrototype(String tag) {
        name = tag;
    }

    @Override
    public Object clone() {
        // 最简单的克隆，新建一个自身对象。
        ConcretePrototype concretePrototype = new ConcretePrototype(this.name);
        concretePrototype.age = this.age;
        return concretePrototype;
    }
}
