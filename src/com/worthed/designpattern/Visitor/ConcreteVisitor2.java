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

package com.worthed.designpattern.Visitor;

/**
 * Created by zhenguo on 12/21/14.
 */
public class ConcreteVisitor2 implements Visitor {
    @Override
    public void visitElementA(Element element) {
        System.out.println(element.getClass().getSimpleName() + " 被 " + this.getClass().getSimpleName() + " 访问");
    }

    @Override
    public void visitElementB(Element element) {
        System.out.println(element.getClass().getSimpleName() + " 被 " + this.getClass().getSimpleName() + " 访问");
    }
}
