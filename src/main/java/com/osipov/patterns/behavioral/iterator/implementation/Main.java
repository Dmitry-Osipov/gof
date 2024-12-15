package com.osipov.patterns.behavioral.iterator.implementation;

import com.osipov.patterns.behavioral.iterator.implementation.hard.BinaryTreeTypeIterator;
import com.osipov.patterns.behavioral.iterator.implementation.hard.SimpleBinaryTreeImpl;
import com.osipov.patterns.behavioral.iterator.implementation.simple.SimpleStack;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        SimpleStack<Integer> stack = new SimpleStack<>();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        for (Integer integer : stack) {
            System.out.println(integer);
        }

        System.out.println("############################################################");

        SimpleBinaryTreeImpl<Integer> tree = new SimpleBinaryTreeImpl<>();
        for (int i = 0; i < 10; i++) {
            tree.insert(i);
        }

        Iterator<Integer> inOrderIterator = tree.iterator(BinaryTreeTypeIterator.IN_ORDER);
        while (inOrderIterator.hasNext()) {
            System.out.println(inOrderIterator.next());
        }
        System.out.println("----------------------------");
        Iterator<Integer> postOrderIterator = tree.iterator(BinaryTreeTypeIterator.POST_ORDER);
        while (postOrderIterator.hasNext()) {
            System.out.println(postOrderIterator.next());
        }
    }
}
