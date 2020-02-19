package com.thoughtworks.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;

public class Practice1 {
    public static void main(String[] args) {
        System.out.println(randomNumber());
    }

    /**
     *  生成10个0到20的随机整数，要求不能重复
     */
    public static Collection<Integer> randomNumber() {
        HashSet<Integer> hashSet = new HashSet<>();
        Random random = new Random();
        while (hashSet.size() < 10) {
            hashSet.add(random.nextInt(20));
        }
        return hashSet;
    }
}
