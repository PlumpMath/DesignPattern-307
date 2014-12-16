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

package com.worthed.designpattern.Interpreter;

import java.util.ArrayList;

/**
 * 客户端调用
 * 解释器模式(Interpreter)，给定一个语言，定义它的文法的一种表示，并定义一个解释器，
 * 这个解释器使用该表示来解释语言中的句子。
 *
 * Created by zhenguo on 12/16/14.
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();

        ArrayList<AbstractExpression> list = new ArrayList<AbstractExpression>();
        list.add(new TerminalExpression());
        list.add(new NonterminalExpression());
        list.add(new TerminalExpression());
        list.add(new NonterminalExpression());

        for (AbstractExpression expression : list) {
            expression.interpret(context);
        }
    }

}
