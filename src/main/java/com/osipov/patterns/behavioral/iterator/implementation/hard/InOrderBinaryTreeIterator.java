package com.osipov.patterns.behavioral.iterator.implementation.hard;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class InOrderBinaryTreeIterator<T extends Comparable<T>> implements BinaryTreeIterator<T> {
    private final Deque<SimpleBinaryTreeImpl.TreeNode<T>> stack = new ArrayDeque<>();

    public InOrderBinaryTreeIterator(SimpleBinaryTreeImpl<T> tree) {
        pushLeft(tree.root);
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more elements in the tree");
        }

        SimpleBinaryTreeImpl.TreeNode<T> node = stack.pop();
        T result = node.data;

        if (node.right != null) {
            pushLeft(node.right);
        }

        return result;
    }

    private void pushLeft(SimpleBinaryTreeImpl.TreeNode<T> node) {
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }
}
