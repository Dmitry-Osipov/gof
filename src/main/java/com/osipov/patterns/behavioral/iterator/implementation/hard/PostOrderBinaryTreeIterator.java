package com.osipov.patterns.behavioral.iterator.implementation.hard;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class PostOrderBinaryTreeIterator<T extends Comparable<T>> implements BinaryTreeIterator<T> {
    private final Deque<SimpleBinaryTreeImpl.TreeNode<T>> stack = new ArrayDeque<>();

    public PostOrderBinaryTreeIterator(SimpleBinaryTreeImpl<T> tree) {
        fillStack(tree.root);
    }

    private void fillStack(SimpleBinaryTreeImpl.TreeNode<T> root) {
        Deque<SimpleBinaryTreeImpl.TreeNode<T>> helper = new ArrayDeque<>();
        helper.push(root);

        while (!helper.isEmpty()) {
            SimpleBinaryTreeImpl.TreeNode<T> node = helper.pop();
            stack.push(node);

            if (node.left != null) {
                helper.push(node.left);
            }

            if (node.right != null) {
                helper.push(node.right);
            }
        }
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

        return stack.pop().data;
    }
}
