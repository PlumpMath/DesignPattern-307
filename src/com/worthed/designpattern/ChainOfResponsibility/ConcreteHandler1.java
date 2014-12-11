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
 * 具体处理者类1
 * 当请求数在0到10之间则有权处理，否则转到下一位。
 * <p/>
 * Created by zhenguo on 12/11/14.
 */
public class ConcreteHandler1 extends Handler {
    @Override
    public void handlerRequest(int request) {
        if (request >= 0 && request < 10) {
            System.out.println(getClass().getSimpleName() + " 处理请求 " + request);
        } else if (successor != null) {
            successor.handlerRequest(request);
        }
    }
}
