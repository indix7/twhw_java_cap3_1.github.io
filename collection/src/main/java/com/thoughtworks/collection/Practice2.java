package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class Practice2 {

    public static void main(String[] args) {
        //分别用for循环、增强for循环、迭代器遍历并打印getNumbers返回的List
        long t1 = System.currentTimeMillis();
        List<Integer> list = getNumbers();
        forLoop(list);
        forEachLoop(list);
        iterateLoop(list);
        System.out.println(System.currentTimeMillis()-t1);  //ArrayList 34, LinkedList 13
    }

    /**
     * 创建一个List 然后在List中添加0到100整数
     */
    public static List<Integer> getNumbers() {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i <= 100; i++) {
            list.add(i);
        }
        return list;
    }

    public static void forLoop(List<Integer> list) {
        for (int index = 0; index < list.size(); index ++) {
            System.out.println(list.get(index));
        }
    }

    public static void forEachLoop(List<Integer> list) {
        for (int element: list) {
            System.out.println(element);
        }
    }

    public static void iterateLoop(List<Integer> list) {
        for(Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
            System.out.println(iterator.next());
        }
    }
}
