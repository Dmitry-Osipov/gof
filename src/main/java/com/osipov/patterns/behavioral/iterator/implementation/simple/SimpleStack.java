package com.osipov.patterns.behavioral.iterator.implementation.simple;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class SimpleStack<T> implements Stack<T>, Iterable<T> {
    private Node<T> head;

    @Override
    public void push(T item) {
        if (isEmpty()) {
            head = new Node<>(item);
        } else {
            head = new Node<>(item, head);
        }
    }

    @Override
    public void pushAll(Collection<? extends T> collection) {
        for (T item : collection) {
            push(item);
        }
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        } else {
            T result = head.data;
            head = head.next;
            return result;
        }
    }

    @Override
    public void popAll(Collection<? super T> collection) {
        while (!isEmpty()) {
            collection.add(pop());
        }
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            Node<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException("Stack is empty");
                }

                T value = current.data;
                current = current.next;
                return value;
            }
        };
    }

    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
        }

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }
}
