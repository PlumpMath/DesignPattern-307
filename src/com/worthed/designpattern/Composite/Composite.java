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

package com.worthed.designpattern.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 子节点
 * 组合模式(Composite)，将对象组合成树形结构以表示‘部分-整体’的层次结构。组合模式使得用户
 * 对单个对象和组合对象的使用具有一致性。
 *
 * Created by zhenguo on 11/30/14.
 */
public class Composite extends Component {

    private List<Component> children = new ArrayList<Component>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void display(int depth) {
        System.out.println(getDepthStr(depth) + name);
        for (Component component : children) {
            component.display(depth + 2);
        }
    }
}
