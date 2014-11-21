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

package com.worthed.designpattern.SimpleFactory;

/**
 * 简单工厂类
 *
 * Created by zhenguo on 11/22/14.
 */
public class SimpleFactory {

    /**
     * 获取与参数运算符相匹配的类实例
     *
     * @param operator 运算符
     * @return 返回与参数运算符相匹配的类实例
     */
    public Operation createOperation(char operator) {
        switch (operator) {
            case '+':
                return new AddOperation();
            case '-':
                return new SubOperation();
            case '*':
                return new MulOperation();
            case '/':
                return new DivOperation();
            default:
                try {
                    throw new Exception("找不到与" + operator + "相匹配的运算符");
                } catch (Exception e) {
                    e.printStackTrace();
                }

        }
        return null;
    }
}
