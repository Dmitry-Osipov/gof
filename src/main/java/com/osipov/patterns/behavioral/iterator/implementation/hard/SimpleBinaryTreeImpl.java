package com.osipov.patterns.behavioral.iterator.implementation.hard;

import java.util.Iterator;

public class SimpleBinaryTreeImpl<T extends Comparable<T>> {
    TreeNode<T> root;

    public void insert(T data) {
        root = insert(root, data);
    }

    private TreeNode<T> insert(TreeNode<T> node, T data) {
        if (node == null) {
            return new TreeNode<>(data);
        }

        if (data.compareTo(node.data) < 0) {
            node.left = insert(node.left, data);
        } else if (data.compareTo(node.data) > 0) {
            node.right = insert(node.right, data);
        }

        return node;
    }

    public void delete(T data) {
        root = delete(root, data);
    }

    private TreeNode<T> delete(TreeNode<T> node, T data) {
        if (node == null) {
            return null;
        }

        if (data.compareTo(node.data) < 0) {
            node.left = delete(node.left, data);
        } else if (data.compareTo(node.data) > 0) {
            node.right = delete(node.right, data);
        } else {
            if (node.left == null && node.right == null) {
                return null;
            }
            if (node.left == null) {
                return node.right;
            }
            if (node.right == null) {
                return node.left;
            }

            T smallestValue = findSmallestValue(node.right);
            node.data = smallestValue;
            node.right = delete(node.right, smallestValue);
        }

        return node;
    }

    private T findSmallestValue(TreeNode<T> root) {
        return root.left == null ? root.data : findSmallestValue(root.left);
    }

    public Iterator<T> iterator(BinaryTreeTypeIterator iteratorType) {
        Iterator<T> iterator;
        switch (iteratorType) {
            case IN_ORDER -> iterator = new InOrderBinaryTreeIterator<>(this);
            case POST_ORDER -> iterator = new PostOrderBinaryTreeIterator<>(this);
            case null, default -> throw new IllegalArgumentException("unknown iterator type");
        }

        return iterator;
    }

    static class TreeNode<T> {
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data) {
            this.data = data;
        }
    }
}
