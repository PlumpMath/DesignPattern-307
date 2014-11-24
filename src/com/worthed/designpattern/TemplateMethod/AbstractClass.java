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

package com.worthed.designpattern.TemplateMethod;

/**
 * 抽象模板
 *
 * Created by zhenguo on 11/24/14.
 */
public abstract class AbstractClass {

    public abstract void start();

    public abstract void end();

    /**
     * 模板方法 实现算法骨架
     */
    public void run() {
        System.out.println("模板方法：");
        start();
        end();
    }

}
